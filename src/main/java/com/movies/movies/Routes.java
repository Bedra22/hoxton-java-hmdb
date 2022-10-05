package com.movies.movies;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Routes {

    @GetMapping("/actor")
    public ArrayList<Actor> getActors() {
        return Actor.actors;
    }

    @GetMapping("/actor/{id}")
    public Integer getOneActor(@PathVariable Integer id) {
        return id;
    }

    @GetMapping("/movies")
    public ArrayList<Movies> getMovies() {
        return Movies.movies;
    }

    @PostMapping("/actor")
    public Actor createActor(@RequestBody Actor actors) {
        return actors;
    }

    @PostMapping("/movies")
    public Movies createMovies(@RequestBody Movies movies) {
        return movies;
    }
}
