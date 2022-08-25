package com.admiralxy.cinema.repositories.interfaces;

import com.admiralxy.cinema.entities.Session;
import java.util.List;

public interface ISessionsRepository {
    List<Session> findAll();
    void save(Session session);
}
