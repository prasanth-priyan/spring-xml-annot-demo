package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Actor actor(){
        Actor actor = new Actor();
        actor.setName("Prabhas");
        actor.setAge(32);
        actor.setGender("Male");
        return actor;
    }

    @Bean
    public Movie movie(){
        Movie movie = new Movie();
        movie.setActor(actor());
        return movie;
    }
}
