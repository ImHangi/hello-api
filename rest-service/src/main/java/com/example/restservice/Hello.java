package com.example.restservice;

public class Hello {

  private String name;
  private int count;

  public Hello(String name, int count) {
    this.name = name;
    this.count = count;
  }

  public String getMessage() {
    return name;
  }
}
