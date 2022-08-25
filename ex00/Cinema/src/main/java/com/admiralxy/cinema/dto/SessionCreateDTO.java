package com.admiralxy.cinema.dto;

import com.admiralxy.cinema.entities.Film;
import com.admiralxy.cinema.entities.Hall;
import com.admiralxy.cinema.entities.Session;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class SessionCreateDTO {

    private Long hall_id;

    private Long film_id;

    @DateTimeFormat(pattern = "dd.MM.yyyy HH:mm")
    private Date start_at;

    private BigDecimal cost;

    public Session toEntity() {
        Hall hall = new Hall();
        hall.setId(this.hall_id);

        Film film = new Film();
        film.setId(this.film_id);

        return new Session(hall, film, this.start_at, this.cost);
    }
}
