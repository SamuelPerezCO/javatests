package com.unp.javatests.movies.data;

import com.unp.javatests.movies.model.Genre;
import com.unp.javatests.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.Collection;

public class MovieRepositoryJdbc implements MovieRepository {

    private JdbcTemplate jdbcTemplate;

    public MovieRepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
        return null;
    }

    @Override
    public Collection<Movie> findAll() {

        return jdbcTemplate.query("select * from movies" , movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {

    }


    private static final RowMapper<Movie> movieMapper = (rs, rowNum)->
            new Movie(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("minutes"),
                    Genre.valueOf("genre")
            );
}
