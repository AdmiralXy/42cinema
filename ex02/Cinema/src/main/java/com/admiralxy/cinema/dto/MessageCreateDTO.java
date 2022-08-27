package com.admiralxy.cinema.dto;

import com.admiralxy.cinema.entities.Film;
import com.admiralxy.cinema.entities.Message;
import lombok.Data;
import java.util.Date;

@Data
public class MessageCreateDTO {

    private Long film_id;

    private String username;

    private String message;

    public Message toEntity() {
        Film film = new Film();
        film.setId(this.film_id);

        return new Message(film, this.username, this.message, new Date());
    }
}
