package com.example.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private static final String template = "Hello %s";

  @GetMapping("/hello")
  @ResponseStatus(value = HttpStatus.OK)
  public Hello hello(@RequestParam(value = "name", defaultValue = "") String name,
      @RequestParam(value = "count", defaultValue = "1") int count) {
    return new Hello(String.format(template, name), count);
  }
}
