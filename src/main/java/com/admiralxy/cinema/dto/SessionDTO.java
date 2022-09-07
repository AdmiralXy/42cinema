package com.admiralxy.cinema.dto;

import com.admiralxy.cinema.entities.Film;
import com.admiralxy.cinema.entities.Hall;
import com.admiralxy.cinema.entities.Session;
import lombok.Data;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Data
public class SessionDTO {

    private Long id;

    private Hall hall;

    private Film film;

    private String start_at;

    private BigDecimal cost;

    public static SessionDTO fromEntity(Session session) {
        SessionDTO sessionDTO = new SessionDTO();
        sessionDTO.id = session.getId();
        sessionDTO.hall = session.getHall();
        sessionDTO.film = session.getFilm();
        sessionDTO.start_at = new SimpleDateFormat("dd.MM.yyyy HH:mm")
                .format(session.getStartAt());
        sessionDTO.cost = session.getCost();
        return sessionDTO;
    }

    public static List<SessionDTO> fromEntities(List<Session> sessions) {
        List<SessionDTO> sessionsDto = new ArrayList<>();
        for (Session session : sessions) {
            sessionsDto.add(fromEntity(session));
        }
        return sessionsDto;
    }
}
