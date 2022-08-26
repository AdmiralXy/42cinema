package com.admiralxy.cinema.services;

import com.admiralxy.cinema.dto.SessionCreateDTO;
import com.admiralxy.cinema.entities.Session;
import com.admiralxy.cinema.repositories.interfaces.ISessionsRepository;
import com.admiralxy.cinema.services.interfaces.ISessionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
public class SessionsService implements ISessionsService {

    private final ISessionsRepository sessionsRepository;

    @Autowired
    public SessionsService(ISessionsRepository sessionsRepository) {
        this.sessionsRepository = sessionsRepository;
    }

    @Override
    public Session findById(int id) {
        return this.sessionsRepository.findById(id);
    }

    @Override
    public List<Session> findAll() {
        return this.sessionsRepository.findAll();
    }

    @Override
    public List<Session> findByFilmTitle(String title) {
        return this.sessionsRepository.findByFilmTitle(title);
    }

    @Override
    public void save(SessionCreateDTO session) {
        this.sessionsRepository.save(session.toEntity());
    }
}
