package com.admiralxy.cinema.services.interfaces;

import com.admiralxy.cinema.dto.SessionCreateDTO;
import com.admiralxy.cinema.entities.Session;

import java.util.List;

public interface ISessionsService {
    List<Session> findAll();
    void save(SessionCreateDTO session);
}
