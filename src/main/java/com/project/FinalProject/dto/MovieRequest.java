package com.project.FinalProject.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MovieRequest {
    private String title;
    private String genre;
    private String duration;
    private String director;
    private float rating;
}
