package com.admiralxy.cinema.services;

import com.admiralxy.cinema.dto.HallCreateDTO;
import com.admiralxy.cinema.entities.Hall;
import com.admiralxy.cinema.repositories.interfaces.IHallsRepository;
import com.admiralxy.cinema.services.interfaces.IHallsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
public class HallsService implements IHallsService {

    private final IHallsRepository hallsRepository;

    @Autowired
    public HallsService(IHallsRepository hallsRepository) {
        this.hallsRepository = hallsRepository;
    }

    @Override
    public List<Hall> findAll() {
        return this.hallsRepository.findAll();
    }

    @Override
    public void save(HallCreateDTO film) {
        this.hallsRepository.save(film.toEntity());
    }
}
