package com.admiralxy.cinema.services.interfaces;

import com.admiralxy.cinema.dto.FilmCreateDTO;
import com.admiralxy.cinema.entities.Film;
import java.util.List;

public interface IFilmsService {
    Film findById(Long id);
    List<Film> findAll();
    Film save(FilmCreateDTO film);
}
