package com.admiralxy.cinema.repositories;

import com.admiralxy.cinema.entities.Film;
import com.admiralxy.cinema.repositories.interfaces.IFilmsRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class FilmsRepository implements IFilmsRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Film> findAll() {
        return entityManager.createQuery("FROM Film", Film.class).getResultList();
    }

    @Override
    public Film save(Film film) {
        entityManager.persist(film);
        entityManager.flush();
        return film;
    }
}
