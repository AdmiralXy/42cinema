package com.admiralxy.cinema.dto;

import lombok.Data;
import com.admiralxy.cinema.dto.interfaces.MappableDTO;
import com.admiralxy.cinema.entities.Hall;

@Data
public class HallCreateDTO implements MappableDTO<Hall> {

    private Integer serial;

    private Integer seats;

    @Override
    public Hall toEntity() {
        return new Hall(this.serial, this.seats);
    }

    @Override
    public void fromEntity(Hall hall) {
        this.serial = hall.getSerial();
        this.seats = hall.getSeats();
    }
}
