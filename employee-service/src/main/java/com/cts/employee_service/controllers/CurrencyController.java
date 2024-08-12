package com.cts.employee_service.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.employee_service.configurations.CurrencyServiceConfig;

@RestController
public class CurrencyController {

  @Autowired
  private CurrencyServiceConfig config;

  @GetMapping("/cur-conf")
  public CurrencyServiceConfig getCurrencyConfig() {
    return config;
  }
}
