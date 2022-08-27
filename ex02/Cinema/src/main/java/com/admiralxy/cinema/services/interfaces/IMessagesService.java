package com.admiralxy.cinema.services.interfaces;

import com.admiralxy.cinema.entities.Message;
import java.util.List;

public interface IMessagesService {
    List<Message> findByFilmId(Long id);
    Message save(Message message);
}
