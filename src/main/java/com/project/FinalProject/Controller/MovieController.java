package com.project.FinalProject.Controller;

import com.project.FinalProject.Service.MovieService;
import com.project.FinalProject.dto.MovieRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @PostMapping(value = "/AddMovieFinalProject")
    public String addMovie(@RequestBody MovieRequest request){
        String output = movieService.save(request);
        return output;
    }

    @GetMapping(value = "/GetMovieFinalProject/{id}")
    public String getDataMovieById(@PathVariable Long id){
        return movieService.get(id);
    }
}
