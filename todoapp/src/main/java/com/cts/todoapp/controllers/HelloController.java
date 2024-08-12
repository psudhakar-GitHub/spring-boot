package com.cts.todoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

  @GetMapping("/hello")
  @ResponseBody
  public String sayHello() {
    return "Hello! How are you today!";
  }

  // \src\main\resources\META-INF\resources\WEB-INF\jsp\hello.jsp
  @GetMapping("/hello-jsp")
  public String sayHelloJSP() {
    return "hello";
  }
}
