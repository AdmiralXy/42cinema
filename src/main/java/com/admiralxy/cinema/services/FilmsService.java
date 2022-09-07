package com.admiralxy.cinema.services;

import com.admiralxy.cinema.dto.FilmCreateDTO;
import com.admiralxy.cinema.entities.Film;
import com.admiralxy.cinema.repositories.interfaces.IFilmsRepository;
import com.admiralxy.cinema.services.interfaces.IFilmsService;
import com.admiralxy.cinema.services.interfaces.IStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
public class FilmsService implements IFilmsService {

    private final IFilmsRepository filmsRepository;

    private final IStorageService storageService;

    @Autowired
    public FilmsService(IFilmsRepository filmsRepository, IStorageService storageService) {
        this.filmsRepository = filmsRepository;
        this.storageService = storageService;
    }

    @Override
    public Film findById(Long id) {
        return this.filmsRepository.findById(id);
    }

    @Override
    public List<Film> findAll() {
        return this.filmsRepository.findAll();
    }

    @Override
    public Film save(FilmCreateDTO film) {
        Film createdFilm = this.filmsRepository.save(film.toEntity());
        String id = createdFilm.getId().toString();
        this.storageService.storeAsImage(film.getPoster(), "posters", id);
        return createdFilm;
    }
}
