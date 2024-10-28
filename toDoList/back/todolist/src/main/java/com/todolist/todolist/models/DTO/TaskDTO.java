package com.todolist.todolist.models.DTO;

public class TaskDTO {
    private String taskName;
    private int userId;

    public TaskDTO(String taskName, int userId) {
        this.taskName = taskName;
        this.userId = userId;
    }
    
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
}
