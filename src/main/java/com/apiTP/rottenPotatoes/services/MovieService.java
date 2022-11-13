package com.apiTP.rottenPotatoes.services;

import com.apiTP.rottenPotatoes.models.MovieModel;
import com.apiTP.rottenPotatoes.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional
    public MovieModel save(MovieModel movieModel) {
        return movieRepository.save(movieModel);
    }


    public boolean existsByMovieName(String movieName) {
        return movieRepository.existsByMovieName(movieName);
    }
}
