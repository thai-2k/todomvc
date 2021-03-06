package com.example.springboottodomvc.todo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public List<Todo> findAll(){return todoRepository.findAll();}

    public List<Todo> savedAll(List<Todo> todos){return todoRepository.saveAll(todos);}

}
