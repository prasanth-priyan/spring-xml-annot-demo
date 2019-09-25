package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    @Autowired
    private Actor actor1;


    public void starring(){
        System.out.println(this.actor1);
    }
}
