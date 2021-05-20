package com.example.restservice.service;

import com.example.restservice.Hello;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

  @Override
  public Hello getNameMessage(String name) {
    return new Hello(name);
  }

  @Override
  public List<Hello> repeatMessage(String name, int count) {
    List<Hello> messageList = new ArrayList<>();

    for (int i = 1; i <= count; i++) {
      messageList.add(new Hello(name));
    }
    return messageList;
  }
}
