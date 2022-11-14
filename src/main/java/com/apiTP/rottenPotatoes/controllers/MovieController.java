package com.apiTP.rottenPotatoes.controllers;

import com.apiTP.rottenPotatoes.dtos.MovieDTO;
import com.apiTP.rottenPotatoes.models.MovieModel;
import com.apiTP.rottenPotatoes.services.MovieService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Null;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping
    public ResponseEntity<Object> saveMovie(@RequestBody @Valid MovieDTO movieDTO) {
        if(movieService.existsByMovieName(movieDTO.getMovieName())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Movie name is already exists");
        }
        var movieModel = new MovieModel();
        BeanUtils.copyProperties(movieDTO, movieModel);
        movieModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(movieService.save(movieModel));
    }

    @GetMapping
    public ResponseEntity<List<MovieModel>> getAllMovies() {
        return ResponseEntity.status(HttpStatus.OK).body(movieService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> getMovieById(@PathVariable(value = "id") Long id) {
        Optional<MovieModel> movieModelOptional = movieService.findById(id);
        if(!movieModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body("Movie not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(movieModelOptional.get());
    }
}
