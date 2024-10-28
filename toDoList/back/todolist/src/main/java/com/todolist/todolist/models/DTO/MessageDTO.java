package com.todolist.todolist.models.DTO;
import java.time.LocalDateTime;

public class MessageDTO {

    private LocalDateTime time;
    private String message;
    
    public MessageDTO(LocalDateTime time, String message) {
        this.time = time;
        this.message = message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}