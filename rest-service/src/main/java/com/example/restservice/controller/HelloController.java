package com.example.restservice.controller;

import com.example.restservice.Hello;
import com.example.restservice.service.HelloService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Autowired
  HelloService helloService;

  private static final String template = "Hello %s";

  @GetMapping("/hello")
  public Hello helloList() {
    return new Hello("Hello");
  }

  @GetMapping("/hello2")
  public Hello helloList(@RequestParam(value = "name", defaultValue = "") String name) {
    return helloService.getNameMessage(String.format(template, name));
  }

  @GetMapping("/hello3")
  public List<Hello> helloList(@RequestParam(value = "name", defaultValue = "") String name,
      @RequestParam(value = "count", defaultValue = "1") int count) {

    List<Hello> messageList = helloService.repeatMessage(String.format(template, name), count);
    return messageList;
  }
}
