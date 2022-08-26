package com.admiralxy.cinema.repositories;

import com.admiralxy.cinema.entities.Session;
import com.admiralxy.cinema.repositories.interfaces.ISessionsRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SessionsRepository implements ISessionsRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Session> findAll() {
        return entityManager.createQuery("SELECT s FROM Session s JOIN FETCH s.film f JOIN FETCH s.hall h", Session.class).getResultList();
    }

    @Override
    public void save(Session session) {
        entityManager.persist(session);
    }
}
