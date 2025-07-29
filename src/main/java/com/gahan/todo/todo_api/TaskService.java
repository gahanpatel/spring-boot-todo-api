package com.gahan.todo.todo_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task createTask(String title, String description) {
        Task task = new Task(title, description);
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        if (taskRepository.findById(id).isPresent()) {
            taskRepository.deleteById(id);
        } else throw new TaskNotFound(id);
    }

    public Task updateTask(Long id, Task updatedTask) {
        Optional<Task> find = taskRepository.findById(id);
        if (find.isPresent()) {
            Task get = find.get();
            get.setTitle(updatedTask.getTitle());
            get.setDescription(updatedTask.getDescription());
            get.setCompleted(updatedTask.isCompleted());
            get.setDueDate(updatedTask.getDueDate());
            return taskRepository.save(get);

        } else {
            throw new TaskNotFound(id);
        }
    }

    public Task getTaskById(Long id) {
        Optional<Task> find = taskRepository.findById(id);
        if (find.isPresent()) {
            return taskRepository.save(find.get());
        } else throw new TaskNotFound(id);
    }

    public Task markTaskAsCompleted(Long id) {
        Optional<Task> find = taskRepository.findById(id);
        if (find.isPresent()) {
            Task task = find.get();
            task.setCompleted(true);
            return taskRepository.save(task);
        } else throw new TaskNotFound(id);
    }
}
