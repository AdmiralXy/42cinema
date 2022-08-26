package com.admiralxy.cinema.repositories.interfaces;

import com.admiralxy.cinema.entities.Hall;
import java.util.List;

public interface IHallsRepository {
    List<Hall> findAll();
    void save(Hall hall);
}
