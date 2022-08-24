package com.admiralxy.cinema.dto;

import lombok.*;
import com.admiralxy.cinema.entities.Film;
import com.admiralxy.cinema.dto.interfaces.MappableDTO;
import org.springframework.web.multipart.MultipartFile;

@Data
public class FilmCreateDTO implements MappableDTO<Film> {
    private String title;
    private String release_date;
    private String age_restrictions;
    private String description;
    private MultipartFile poster;

    @Override
    public Film toEntity() {
        return new Film(this.title, this.release_date, this.age_restrictions, this.description);
    }

    @Override
    public void fromEntity(Film film) {
        this.title = film.getTitle();
        this.release_date = film.getReleaseDate();
        this.age_restrictions = film.getAgeRestrictions();
        this.description = film.getDescription();
    }
}
