package com.example.tasktracker.repository;

import com.example.tasktracker.model.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

    Page<Task> findByStatusAndPriorityAndCategoryContainingIgnoreCase(
            Task.Status status,
            Task.Priority priority,
            String category,
            Pageable pageable
    );

    Page<Task> findByStatusAndCategoryContainingIgnoreCase(
            Task.Status status,
            String category,
            Pageable pageable
    );

    Page<Task> findByPriorityAndCategoryContainingIgnoreCase(
            Task.Priority priority,
            String category,
            Pageable pageable
    );

    Page<Task> findByCategoryContainingIgnoreCase(
            String category,
            Pageable pageable
    );
}
