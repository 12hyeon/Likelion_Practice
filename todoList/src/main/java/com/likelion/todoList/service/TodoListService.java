package com.likelion.todoList.service;

import com.likelion.todoList.domain.TodoList;
import com.likelion.todoList.dto.TodoListDto;
import com.likelion.todoList.repository.TodoListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoListService {

    private final TodoListRepository todoListRepository;

    public TodoListService(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    public Object saveList(TodoListDto todoListDto) {
        TodoList todoList = new TodoList(todoListDto.getDetail());
        todoListRepository.save(todoList);
        return todoList.getDetail() + " 저장";
    }

    public Object findList() {
        List<TodoList> todoLists = todoListRepository.findAll();
        return todoLists;
    }

    public Object deleteList(Long id) {
        Optional<TodoList> todoListOptional = todoListRepository.findById(id);
        if (todoListOptional.isPresent()) {
            todoListRepository.delete(todoListOptional.get());
            return "삭제 완료";
        }
        return "해당하는 list 존재하지 않음";
    }
}
