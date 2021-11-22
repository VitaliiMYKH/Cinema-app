package mykh.vitalii.spring.dao.impl;

import mykh.vitalii.spring.dao.AbstractDao;
import mykh.vitalii.spring.dao.CinemaHallDao;
import mykh.vitalii.spring.model.CinemaHall;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
