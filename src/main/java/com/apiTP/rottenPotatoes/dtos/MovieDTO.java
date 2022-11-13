package com.apiTP.rottenPotatoes.dtos;

import javax.validation.constraints.NotBlank;


public class MovieDTO {

    private String movieName;
    private String movieCategory;
    private Double score;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
