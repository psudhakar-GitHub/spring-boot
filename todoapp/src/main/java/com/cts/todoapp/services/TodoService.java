package com.cts.todoapp.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.todoapp.models.Todo;

@Service
public class TodoService {

  private static List<Todo> todos = new ArrayList<>();

  static {
    todos.add(new Todo(1, "sp", "Learn java", LocalDate.now().plusDays(5), false));
    todos.add(new Todo(4, "sp", "Learn mongodb", LocalDate.now().plusDays(5), false));
    todos.add(new Todo(2, "pd", "Learn mysql", LocalDate.now().plusDays(10), false));
    todos.add(new Todo(3, "vs", "Learn php", LocalDate.now().plusDays(25), false));
  }

  public List<Todo> findByUser(String user) {
    return todos;
  }
}
