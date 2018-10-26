package com.stackroute.moviecruiser.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Year;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    private Integer id;
    private String title;
    private String posterPath;
    private BigDecimal rating;
    private Year releaseYear;
}
