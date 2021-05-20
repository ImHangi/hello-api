package com.example.restservice.service;

import com.example.restservice.User;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private Map<Integer, User> userMap = new LinkedHashMap<>();

  @Override
  public User createUser(User user) {
    User userData = new User(user.getId(), user.getName());
    userMap.put(userData.getId(), userData);
    return userData;
  }

  @Override
  public void deleteUser(int id) {
    userMap.remove(id);
  }

  @Override
  public User modifyUser(User user) {
    return userMap.replace(user.getId(), user);
  }

  @Override
  public List<User> selectUser() {
    // List<User> users =
    // userMap.values().stream().collect(Collectors.toCollection(ArrayList::new));
    List<User> users = userMap.values().stream().collect(Collectors.toList());

    return users;
  }

}
