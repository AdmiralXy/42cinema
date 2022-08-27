package com.admiralxy.cinema.services;

import com.admiralxy.cinema.entities.Message;
import com.admiralxy.cinema.repositories.interfaces.IMessagesRepository;
import com.admiralxy.cinema.services.interfaces.IMessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
public class MessagesService implements IMessagesService {

    private final IMessagesRepository messagesRepository;

    @Autowired
    public MessagesService(IMessagesRepository messagesRepository) {
        this.messagesRepository = messagesRepository;
    }

    @Override
    public List<Message> findByFilmId(Long id) {
        return this.messagesRepository.findByFilmId(id);
    }

    @Override
    public Message save(Message message) {
        return this.messagesRepository.save(message);
    }
}
