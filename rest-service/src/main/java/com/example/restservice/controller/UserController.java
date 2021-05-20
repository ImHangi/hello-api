package com.example.restservice.controller;

import com.example.restservice.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @PostMapping("/create-user")
  public User createUser(@RequestBody int id, String name) {
    return new User(id, name);
  }

  @PutMapping("/modify-user")
  public String modifyUser() {
    return "modify";
  }

  @DeleteMapping("/delete-user")
  public String DeleteUser() {
    return "delete";
  }
}
