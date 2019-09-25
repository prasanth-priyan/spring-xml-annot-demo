package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public Actor actor1(){
        return new Actor("Prabhas", "Male", 32);
    }
    @Bean
    public Actor actor2(){
        return new Actor("Shobha", "Female", 25);
    }
    @Bean
    public Actor actor3(){
        return new Actor("Karthik", "Male", 15);
    }

    @Bean(name = {"baahu1", "baahu2"})
    public Movie movie(){
        Movie movie = new Movie(actor2());
        return movie;
    }

}
