package mykh.vitalii.spring.dao;

import java.util.List;
import java.util.Optional;
import mykh.vitalii.spring.model.CinemaHall;

public interface CinemaHallDao {
    CinemaHall add(CinemaHall cinemaHall);

    Optional<CinemaHall> get(Long id);

    List<CinemaHall> getAll();
}
