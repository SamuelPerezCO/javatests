package com.unp.javatests.movies.data;

import com.unp.javatests.movies.model.Movie;
import java.util.Collection;

public interface MovieRepository {

    Movie findById(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}
