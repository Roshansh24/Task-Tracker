package com.example.tasktracker.service;

import com.example.tasktracker.model.Task;
import com.example.tasktracker.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Page<Task> getTasks(String status, String priority, String category, Pageable pageable) {
        if (status != null && priority != null) {
            return taskRepository.findByStatusAndPriorityAndCategoryContainingIgnoreCase(
                    Task.Status.valueOf(status.toUpperCase()),
                    Task.Priority.valueOf(priority.toUpperCase()),
                    category == null ? "" : category,
                    pageable);
        } else if (status != null) {
            return taskRepository.findByStatusAndCategoryContainingIgnoreCase(
                    Task.Status.valueOf(status.toUpperCase()),
                    category == null ? "" : category,
                    pageable);
        } else if (priority != null) {
            return taskRepository.findByPriorityAndCategoryContainingIgnoreCase(
                    Task.Priority.valueOf(priority.toUpperCase()),
                    category == null ? "" : category,
                    pageable);
        } else {
            return taskRepository.findByCategoryContainingIgnoreCase(
                    category == null ? "" : category,
                    pageable);
        }
    }


    public Task updateTask(Long id, Task updatedTask) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
        if (updatedTask.getTitle() != null) task.setTitle(updatedTask.getTitle());
        if (updatedTask.getDescription() != null) task.setDescription(updatedTask.getDescription());
        if (updatedTask.getStatus() != null) task.setStatus(updatedTask.getStatus());
        if (updatedTask.getPriority() != null) task.setPriority(updatedTask.getPriority());
        if (updatedTask.getDueDate() != null) task.setDueDate(updatedTask.getDueDate());
        if (updatedTask.getCategory() != null) task.setCategory(updatedTask.getCategory());
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public long getTotalTasks() {
        return taskRepository.count();
    }

    public long getCompletedTasks() {
        return taskRepository.findAll().stream()
                .filter(t -> t.getStatus() == Task.Status.DONE)
                .count();
    }
}
