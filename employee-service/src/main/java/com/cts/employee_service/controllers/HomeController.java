package com.cts.employee_service.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.employee_service.models.Course;

@RestController
public class HomeController {

  @GetMapping("/courses")
  public List<Course> getCourses() {
    List<Course> courses = new ArrayList<>();
    courses.add(new Course(1, "Java", "cts"));
    courses.add(new Course(2, "php", "cts"));
    courses.add(new Course(3, "python", "cts"));
    return courses;
  }
}
