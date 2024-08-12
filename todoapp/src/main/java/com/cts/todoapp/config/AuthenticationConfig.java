package com.cts.todoapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationConfig {

  public boolean authenticate(String name, String password) {
    boolean isValidUsername = name.equalsIgnoreCase("sp");
    boolean isValidPassword = password.equals("pass");
    return isValidPassword && isValidUsername;
  }
}
