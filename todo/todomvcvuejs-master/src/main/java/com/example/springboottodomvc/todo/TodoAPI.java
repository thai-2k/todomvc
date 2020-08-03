package com.example.springboottodomvc.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoAPI {
    private final TodoService todoService;

    @Autowired
    public TodoAPI(TodoService stockService){this.todoService = stockService;}

    @GetMapping
    public ResponseEntity<List<Todo>> findAll() {return ResponseEntity.ok(todoService.findAll());}

    @PostMapping
    public ResponseEntity saveAll(@Valid @RequestBody List<Todo> todos){
        return ResponseEntity.ok(todoService.savedAll(todos));
    }
}
