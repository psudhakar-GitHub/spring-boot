package com.cts.todoapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cts.todoapp.models.Todo;
import com.cts.todoapp.services.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {

  // public TodoController(TodoService todoService) {
  // super();
  // this.todoService = todoService;
  // }

  @Autowired
  private TodoService todoService;

  @GetMapping("/todos")
  public String getTodos(ModelMap model) {
    List<Todo> todos = todoService.findByUser("sp");
    model.addAttribute("todos", todos);
    return "todos";
  }
}
