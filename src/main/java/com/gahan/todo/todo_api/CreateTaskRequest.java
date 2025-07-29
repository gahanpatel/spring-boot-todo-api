package com.gahan.todo.todo_api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreateTaskRequest {
    @NotBlank(message = "Title cannot be empty")
    private String title;
    @Size(max = 1000, message = "Description cannot exceed 1000 characters")
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

}
