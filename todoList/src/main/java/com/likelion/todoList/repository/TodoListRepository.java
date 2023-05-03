package com.likelion.todoList.repository;

import com.likelion.todoList.domain.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TodoListRepository extends JpaRepository<TodoList, Long> {
    TodoList save(TodoList todoList);
    List<TodoList> findAll();
    Optional<TodoList> findById(Long id);
}
