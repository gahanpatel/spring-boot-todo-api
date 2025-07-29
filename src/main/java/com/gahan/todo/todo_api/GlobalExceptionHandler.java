package com.gahan.todo.todo_api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TaskNotFound.class)
    public ResponseEntity<String> handleTask(TaskNotFound ex) {
        return ResponseEntity.status(404).body(ex.getMessage());
    }
}
