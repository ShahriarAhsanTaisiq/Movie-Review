package dev.taisiq.movies.service;

import dev.taisiq.movies.entity.Movie;
import dev.taisiq.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Override
    public List<Movie> allMovies() {

        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }
}
