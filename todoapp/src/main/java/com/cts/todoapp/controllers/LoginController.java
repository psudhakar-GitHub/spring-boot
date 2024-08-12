package com.cts.todoapp.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cts.todoapp.config.AuthenticationConfig;

@Controller
@SessionAttributes("name")
public class LoginController {

  // private Logger logger = LoggerFactory.getLogger(getClass());

  private AuthenticationConfig authConfig;

  /*
   * @GetMapping("/login")
   * public String getLogin(@RequestParam String name, ModelMap model) {
   * model.put("name", name);
   * logger.debug("Request param received {}", name);
   * return "login";
   * }
   */

  public LoginController(AuthenticationConfig authConfig) {
    this.authConfig = authConfig;
  }

  @GetMapping("login")
  public String getLogin() {
    return "login";
  }

  @PostMapping("login")
  public String postLogin(@RequestParam String name, @RequestParam String password, ModelMap model) {

    if (authConfig.authenticate(name, password)) {
      model.put("name", name);
      return "welcome";
    }

    model.put("error", "Invalid user");
    return "login";
  }

}
