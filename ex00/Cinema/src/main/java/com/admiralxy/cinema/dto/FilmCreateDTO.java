package com.admiralxy.cinema.dto;

import lombok.*;
import com.admiralxy.cinema.entities.Film;
import com.admiralxy.cinema.dto.interfaces.MappableDTO;
import org.springframework.web.multipart.MultipartFile;

@Data
public class FilmCreateDTO implements MappableDTO<Film> {
    private String title;
    private Integer release_year;
    private String age_restrictions;
    private String description;
    private MultipartFile poster;

    @Override
    public Film toEntity() {
        return new Film(this.title, this.release_year, this.age_restrictions, this.description);
    }

    @Override
    public void fromEntity(Film film) {
        this.title = film.getTitle();
        this.release_year = film.getReleaseYear();
        this.age_restrictions = film.getAgeRestrictions();
        this.description = film.getDescription();
    }
}
