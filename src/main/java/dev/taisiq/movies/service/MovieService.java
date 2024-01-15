package dev.taisiq.movies.service;

import dev.taisiq.movies.entity.Movie;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    public List<Movie> allMovies();


    Optional<Movie> singleMovie(String imdbId);
}
