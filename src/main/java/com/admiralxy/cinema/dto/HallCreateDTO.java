package com.admiralxy.cinema.dto;

import lombok.Data;
import com.admiralxy.cinema.entities.Hall;

@Data
public class HallCreateDTO {

    private Integer serial;

    private Integer seats;

    public Hall toEntity() {
        return new Hall(this.serial, this.seats);
    }
}
