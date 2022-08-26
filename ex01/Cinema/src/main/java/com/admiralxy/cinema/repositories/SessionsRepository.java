package com.admiralxy.cinema.repositories;

import com.admiralxy.cinema.entities.Session;
import com.admiralxy.cinema.repositories.interfaces.ISessionsRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class SessionsRepository implements ISessionsRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Session findById(Long id) {
        TypedQuery<Session> query = entityManager.createQuery(
                "SELECT s FROM Session s WHERE s.id = :id", Session.class
        );
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public List<Session> findAll() {
        return entityManager.createQuery("SELECT s FROM Session s JOIN FETCH s.film f JOIN FETCH s.hall h", Session.class).getResultList();
    }

    @Override
    public List<Session> findByFilmTitle(String title) {
        TypedQuery<Session> query = entityManager.createQuery(
                "SELECT s FROM Session s JOIN FETCH s.film f JOIN FETCH s.hall h WHERE f.title LIKE :title",
                Session.class
        );
        query.setParameter("title", String.format("%%%s%%", title));
        return query.getResultList();
    }

    @Override
    public void save(Session session) {
        entityManager.persist(session);
    }
}
