package com.example;

import com.company.sakila.SakilaApplication;
import com.company.sakila.SakilaApplicationBuilder;
import com.speedment.runtime.connector.mysql.MySqlBundle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
public class Setup {


    @Bean
    public Jackson2ObjectMapperBuilder jacksonBuilder() {
        return new Jackson2ObjectMapperBuilder().indentOutput(true);
    }
}