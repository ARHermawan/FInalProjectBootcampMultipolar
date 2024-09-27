package com.project.FinalProject.Service.impl;

import com.project.FinalProject.Service.MovieService;
import com.project.FinalProject.dto.MovieRequest;
import com.project.FinalProject.entity.Movie;
import com.project.FinalProject.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    private MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @Override
    public String save(MovieRequest request){
        saveToDB(request);
        return "Success";
    }

    @Override
    public String get(Long id){
        Optional<Movie> movie = movieRepository.findById(id);
        if (movie.isPresent()){
            return "Success";
        }else {
            return "ID not Found";
        }
    }

    private void saveToDB(MovieRequest request){
        Movie movie = new Movie();

        movie.setTitle(request.getTitle());
        movie.setGenre(request.getGenre());
        movie.setDuration(request.getDuration());
        movie.setDirector(request.getDirector());
        movie.setRating(request.getRating());

        movieRepository.save(movie);
    }
}
