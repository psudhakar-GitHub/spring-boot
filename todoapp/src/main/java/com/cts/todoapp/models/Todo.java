package com.cts.todoapp.models;

import java.time.LocalDate;
import java.util.Date;

public class Todo {

  private int id;
  private String creator;
  private String description;
  private LocalDate target;
  private boolean isCompleted;

  public Todo() {
  }

  public Todo(int id, String creator, String description, LocalDate target, boolean isCompleted) {
    this.id = id;
    this.creator = creator;
    this.description = description;
    this.target = target;
    this.isCompleted = isCompleted;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean getIsCompleted() {
    return isCompleted;
  }

  public void setIsCompleted(boolean isCompleted) {
    this.isCompleted = isCompleted;
  }

  public LocalDate getTarget() {
    return target;
  }

  public void setTarget(LocalDate target) {
    this.target = target;
  }

  @Override
  public String toString() {
    return "Todo [id=" + id + ", creator=" + creator + ", description=" + description + ", target=" + target
        + ", isCompleted=" + isCompleted + "]";
  }

  public boolean isCompleted() {
    return isCompleted;
  }

}
