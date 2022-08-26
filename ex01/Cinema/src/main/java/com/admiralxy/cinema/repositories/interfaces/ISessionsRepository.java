package com.admiralxy.cinema.repositories.interfaces;

import com.admiralxy.cinema.entities.Session;
import java.util.List;

public interface ISessionsRepository {
    Session findById(int id);
    List<Session> findAll();
    List<Session> findByFilmTitle(String title);
    void save(Session session);
}
