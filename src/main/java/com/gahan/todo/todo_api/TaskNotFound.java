package com.gahan.todo.todo_api;

public class TaskNotFound extends RuntimeException {
    public TaskNotFound(String message) {
        super(message);
    }

    public TaskNotFound(Long id) {
        super("Task with id " + id + " not found");
    }
}
