package com.admiralxy.cinema.services.interfaces;

import com.admiralxy.cinema.dto.HallCreateDTO;
import com.admiralxy.cinema.entities.Hall;
import java.util.List;

public interface IHallsService {
    List<Hall> findAll();
    void save(HallCreateDTO film);
}
