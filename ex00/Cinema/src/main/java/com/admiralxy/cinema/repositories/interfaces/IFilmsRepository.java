package com.admiralxy.cinema.repositories.interfaces;

import com.admiralxy.cinema.entities.Film;
import java.util.List;

public interface IFilmsRepository {
    List<Film> findAll();
    Film save(Film film);
}
