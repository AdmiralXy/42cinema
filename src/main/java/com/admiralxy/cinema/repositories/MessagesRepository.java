package com.admiralxy.cinema.repositories;

import com.admiralxy.cinema.entities.Message;
import com.admiralxy.cinema.repositories.interfaces.IMessagesRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class MessagesRepository implements IMessagesRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Message> findByFilmId(Long id) {
        TypedQuery<Message> query = entityManager.createQuery(
                "SELECT m FROM Message m JOIN FETCH m.film f WHERE f.id = :id ORDER BY m.createdAt DESC", Message.class
        );
        query.setParameter("id", id);
        query.setMaxResults(20);
        return query.getResultList();
    }

    @Override
    public Message save(Message message) {
        entityManager.persist(message);
        entityManager.flush();
        return message;
    }
}
