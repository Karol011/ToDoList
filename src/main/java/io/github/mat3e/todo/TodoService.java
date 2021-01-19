package io.github.mat3e.todo;

import java.util.List;
import java.util.stream.Collectors;

class TodoService {
    private TodoRepository repository;

    public TodoService() {
        this(new TodoRepository());
    }

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    List<TodoDTO> findAll() {
        return repository
                .findAll()
                .stream()
                .map(TodoDTO::new)
                .collect(Collectors.toList());
    }
}
