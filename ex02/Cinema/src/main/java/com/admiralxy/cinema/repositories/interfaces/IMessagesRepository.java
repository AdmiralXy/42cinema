package com.admiralxy.cinema.repositories.interfaces;

import com.admiralxy.cinema.entities.Message;
import java.util.List;

public interface IMessagesRepository {
    List<Message> findByFilmId(Long id);
    Message save(Message message);
}
