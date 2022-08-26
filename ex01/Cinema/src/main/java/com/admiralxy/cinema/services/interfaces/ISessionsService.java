package com.admiralxy.cinema.services.interfaces;

import com.admiralxy.cinema.dto.SessionCreateDTO;
import com.admiralxy.cinema.entities.Session;

import java.util.List;

public interface ISessionsService {
    Session findById(Long id);
    List<Session> findAll();
    List<Session> findByFilmTitle(String title);
    void save(SessionCreateDTO session);
}
