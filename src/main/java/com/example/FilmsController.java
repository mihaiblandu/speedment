package com.example;

import com.company.sakila.SakilaApplication;
import com.company.sakila.SakilaApplicationBuilder;
import com.company.sakila.sakila.sakila.actor.Actor;
import com.company.sakila.sakila.sakila.actor.ActorManager;
import com.company.sakila.sakila.sakila.film.Film;
import com.company.sakila.sakila.sakila.film.FilmManager;
import com.company.sakila.sakila.sakila.film.generated.GeneratedFilm;
import com.company.sakila.sakila.sakila.film_actor.FilmActor;
import com.company.sakila.sakila.sakila.film_actor.FilmActorManager;
import com.speedment.runtime.connector.mysql.MySqlBundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.*;
@CrossOrigin
@RestController
@RequestMapping("/film")
public class FilmsController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final FilmActorManager filmActors;
    private final ActorManager actors;
    private final FilmManager films;

    public FilmsController() {
        SakilaApplication app = new SakilaApplicationBuilder()
                .withBundle(MySqlBundle.class)
                .withPassword("password")
                .build();
        films = app.getOrThrow(FilmManager.class);
        filmActors = app.getOrThrow(FilmActorManager.class);
        actors = app.getOrThrow(ActorManager.class);
    }

    @GetMapping("")
    List<Film> getFilms() {
        return films.stream().collect(toList());
    }

    @GetMapping("{id}")
    Film getFilmById(@PathVariable int id) {
        return films.stream().filter(Film.FILM_ID.equal(id)).findAny().orElse(null);
    }

    @GetMapping("byactor/{actorName}")
    List<Film> getFilmByActor(@PathVariable String actorName) {
        Integer actorId = actors.stream()
                .filter(Actor.LAST_NAME.equalIgnoreCase(actorName))
                .mapToInt(Actor.ACTOR_ID)
                .boxed()
                .findAny()
                .orElse(null);

        return actorId == null ? emptyList() : filmActors.stream()
                .filter(FilmActor.ACTOR_ID.equal(actorId))
                .map(films.finderBy(FilmActor.FILM_ID))
                .collect(toList());
    }

    @GetMapping("byactors/{actorName}")
    Map<String, List<String>> getFilmByActors(@PathVariable String actorName) {
        Set<Integer> actorIds = actors.stream()
                .filter(Actor.LAST_NAME.containsIgnoreCase(actorName)
                    .or(Actor.FIRST_NAME.containsIgnoreCase(actorName)))
                .mapToInt(Actor.ACTOR_ID)
                .distinct()
                .boxed()
                .collect(toSet());

        return actorIds.isEmpty() ? Collections.EMPTY_MAP : filmActors.stream()
                .filter(FilmActor.ACTOR_ID.in(actorIds))
                .collect(
                        groupingBy(actors.finderBy(FilmActor.ACTOR_ID)
                                .andThen(a -> a.getFirstName() + " " + a.getLastName()),
                                mapping(
                                        films.finderBy(FilmActor.FILM_ID)
                                            .andThen(GeneratedFilm::getTitle),
                                        toList()
                                )
                        )
                );
    }
}
