package com.admiralxy.cinema.dto.interfaces;

import java.io.Serializable;

public interface MappableDTO<Entity> extends Serializable {
    Entity toEntity();
    void fromEntity(Entity entity);
}
