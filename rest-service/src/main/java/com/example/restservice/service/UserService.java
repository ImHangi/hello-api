package com.example.restservice.service;

import com.example.restservice.User;
import java.util.List;

public interface UserService {
  User createUser(User user);

  void deleteUser(int id);

  User modifyUser(User user);

  List<User> selectUser();
}
