<img align="center" src="https://github.com/speedment/speedment-resources/blob/master/src/main/resources/wiki/frontpage/Duke-Spire.png?raw=true." alt="Spire the Hare" title="Spire" width="900px">

Java Stream ORM
====================================================

Speedment is an open source Java Stream ORM toolkit and runtime. The toolkit analyzes the metadata of an existing SQL database and automatically creates a Java representation of the data model. This powerful ORM enables you to create scalable and efficient Java applications using **standard Java** streams with no need to type SQL or use any new API. 

Speedment was originally developed by researchers and engineers based in Palo Alto with the purpose to simplify and streamline the development of Java database applications by leveraging the Java Stream API. 

Speedment is licensed under the business-friendly Apache 2 license. Contribution from users is encouraged. Please feel free to request new features, suggest improvements and file bug reports. Read more about contributing [here](https://github.com/speedment/speedment/blob/master/CONTRIBUTING.md). 

<img src="https://github.com/speedment/speedment-resources/blob/master/src/main/resources/wiki/frontpage/Spire-Quick-Start.png?raw=true" alt="Spire the Hare" title="Spire" align="right" width="20%" />

## Quick Start

Assuming you have Maven installed and a relational database available, you can start using Speedment in a minute:

* [Start a New Speedment Maven Project](https://github.com/speedment/speedment/wiki/Start-a-New-Speedment-Maven-Project)
* [Connect to Your Database](https://github.com/speedment/speedment/wiki/Connect-to-Your-Database)

## Demo made on docker container mysql and java 11

There is a remarkable resemblance between Java streams and SQL as summarized in the simplified table. This means there is no need for manually writing SQL-queries any more. You can remain in a pure Java world!

<img align="left" src="https://github.com/speedment/speedment-resources/blob/master/src/main/resources/wiki/frontpage/SQL-Stream.png?raw=true." alt="Streams to SQL" width="400px">

#### Example
Search in a film database for a film with a length greater than 120 minutes:
```java
// Searches are optimized in the background!
Optional<Film> longFilm = films.stream()
    .filter(Film.LENGTH.greaterThan(120))
    .findAny();
``` 

Results in the following SQL query:
```sql
SELECT 
    `film_id`,`title`,`description`,`release_year`,
    `language_id`,`original_language_id`,`rental_duration`,`rental_rate`,
    `length`,`replacement_cost`,`rating`,`special_features`,
    `last_update` 
FROM 
     `sakila`.`film
WHERE
    (`length` > 120)
```
<br>

## How to run it.
    
####  Mac and linux
        
        docker-compose up -d
        
     or 
        
        docker-compose up 
   
     or with super user
        
        sido docker-compose up
        
        
#####  In windows is more complex that can be done by using Chocolate.

 

        
        
        