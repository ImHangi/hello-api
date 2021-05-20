package com.example.restservice.service;

import com.example.restservice.Hello;
import java.util.List;

public interface HelloService {
  Hello getNameMessage(String name);

  List<Hello> repeatMessage(String name, int count);
}
