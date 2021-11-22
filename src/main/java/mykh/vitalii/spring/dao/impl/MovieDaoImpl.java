package mykh.vitalii.spring.dao.impl;

import mykh.vitalii.spring.dao.AbstractDao;
import mykh.vitalii.spring.dao.MovieDao;
import mykh.vitalii.spring.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
