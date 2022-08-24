package com.admiralxy.cinema.entities;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "films")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Film extends BaseEntity {

    @Column(name = "title")
    private String title;

    @Column(name = "release_year")
    private Integer releaseYear;

    @Column(name = "age_restrictions")
    private String ageRestrictions;

    @Lob
    @Column(name = "description", length = 20000)
    private String description;
}
