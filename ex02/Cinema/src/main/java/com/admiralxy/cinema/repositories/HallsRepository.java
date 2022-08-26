package com.admiralxy.cinema.repositories;

import com.admiralxy.cinema.entities.Hall;
import com.admiralxy.cinema.repositories.interfaces.IHallsRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class HallsRepository implements IHallsRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Hall> findAll() {
        return entityManager.createQuery("FROM Hall", Hall.class).getResultList();
    }

    @Override
    public void save(Hall hall) {
        entityManager.persist(hall);
    }
}
