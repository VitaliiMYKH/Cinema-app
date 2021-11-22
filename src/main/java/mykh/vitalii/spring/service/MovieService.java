package mykh.vitalii.spring.service;

import java.util.List;
import mykh.vitalii.spring.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
