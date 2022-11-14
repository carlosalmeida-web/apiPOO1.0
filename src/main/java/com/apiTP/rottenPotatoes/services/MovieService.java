package com.apiTP.rottenPotatoes.services;

import com.apiTP.rottenPotatoes.models.MovieModel;
import com.apiTP.rottenPotatoes.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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

    public List<MovieModel> findAll() {
        return movieRepository.findAll();
    }

    public Optional<MovieModel> findById(Long id) {
        return movieRepository.findById(id);
    }
}
