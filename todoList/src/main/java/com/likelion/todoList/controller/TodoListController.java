package com.likelion.todoList.controller;

import com.likelion.todoList.dto.TodoListDto;
import com.likelion.todoList.service.TodoListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin // 타 도메인에서도 사용 가능
@RestController
@RequiredArgsConstructor
public class TodoListController {

    private final TodoListService todoListService;

    @PostMapping("/save")
    public Object saveTodoList(@RequestBody TodoListDto todoListDto) {
        return todoListService.saveList(todoListDto);
    }

    @GetMapping("/list")
    public Object findList() {
        return todoListService.findList();
    }

    @DeleteMapping("/delete")
    public Object deleteList(@RequestParam Long id) {
        return todoListService.deleteList(id);
    }
}
