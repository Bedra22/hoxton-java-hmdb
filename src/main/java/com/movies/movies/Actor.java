package com.movies.movies;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Actor {

    public static ArrayList<Actor> actors = new ArrayList<>();

    public Integer id;
    public String firstName;
    public String lastName;
    public Integer yearOfBirth;

    static {
        new Actor(1, "Leonardo ", "DiCaprio", 1989);
        new Actor(2, "Robert", "De Niro", 1943);
        new Actor(3, "Meryl", "Streep", 1963);
        new Actor(4, "Julia", "Roberts", 1987);
    }

    public Actor(Integer id, String firstName, String lastName, Integer yearOfBirth) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;

        Actor.actors.add(this);
    }

    public void dispalyInfo() {
        System.out.printf("Actor/Actress:%s %s, Age:%s, Year of birth: %s \n", firstName, lastName, yearOfBirth);
    }
}
