package com.admiralxy.cinema.dto;

import lombok.Data;
import com.admiralxy.cinema.entities.Film;
import org.springframework.web.multipart.MultipartFile;

@Data
public class FilmCreateDTO {

    private String title;
    private Integer release_year;
    private String age_restrictions;
    private String description;
    private MultipartFile poster;

    public Film toEntity() {
        return new Film(this.title, this.release_year, this.age_restrictions, this.description);
    }
}
