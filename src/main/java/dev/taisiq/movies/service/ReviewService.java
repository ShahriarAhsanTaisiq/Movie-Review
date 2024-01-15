package dev.taisiq.movies.service;

import dev.taisiq.movies.entity.Review;

public interface ReviewService {
    public Review createReview(String reviewBody,String imdbId);

}
