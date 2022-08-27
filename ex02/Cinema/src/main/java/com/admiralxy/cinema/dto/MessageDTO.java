package com.admiralxy.cinema.dto;

import com.admiralxy.cinema.entities.Film;
import com.admiralxy.cinema.entities.Message;
import lombok.Data;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Data
public class MessageDTO {

    private Long id;

    private String username;

    private String message;

    private String created_at;

    public static MessageDTO fromEntity(Message message) {
        MessageDTO messageDTO = new MessageDTO();
        messageDTO.id = message.getId();
        messageDTO.username = message.getUsername();
        messageDTO.message = message.getMessage();
        messageDTO.created_at = new SimpleDateFormat("dd.MM.yyyy HH:mm")
                .format(message.getCreatedAt());
        return messageDTO;
    }

    public static List<MessageDTO> fromEntities(List<Message> messages) {
        List<MessageDTO> messagesDto = new ArrayList<>();
        for (Message message : messages) {
            messagesDto.add(fromEntity(message));
        }
        return messagesDto;
    }
}
