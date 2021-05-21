package com.example.restservice.controller;

import com.example.restservice.User;
import com.example.restservice.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  UserService userService;

  @PostMapping("/create-user")
  public User createUser(@RequestBody User user) {
    return userService.createUser(user);
  }

  @DeleteMapping("/delete-user")
  public void DeleteUser(@RequestBody User user) {
    userService.deleteUser(user.getId());
  }

  @PutMapping("/modify-user")
  public User modifyUser(@RequestBody User user) {
    return userService.modifyUser(user);
  }

  @GetMapping("/users")
  public List<User> selectUser() {
    return userService.selectUser();
  }
}
