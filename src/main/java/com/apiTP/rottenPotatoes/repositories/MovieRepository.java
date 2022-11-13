package com.apiTP.rottenPotatoes.repositories;

import com.apiTP.rottenPotatoes.models.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<MovieModel, Long> {
    public boolean existsByMovieName(String movieName);
}
