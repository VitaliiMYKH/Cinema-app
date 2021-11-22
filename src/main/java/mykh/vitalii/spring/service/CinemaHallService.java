package mykh.vitalii.spring.service;

import java.util.List;
import mykh.vitalii.spring.model.CinemaHall;

public interface CinemaHallService {
    CinemaHall add(CinemaHall cinemaHall);

    CinemaHall get(Long id);

    List<CinemaHall> getAll();
}
