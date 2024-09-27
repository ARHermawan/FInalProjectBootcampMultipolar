package com.project.FinalProject.Service;
import com.project.FinalProject.dto.MovieRequest;


public interface MovieService { //Business logic
    String save(MovieRequest movie);

    String get(Long id);
}