package com.example.restservice;

import lombok.Data;

@Data
public class Hello {

  private String message;

  public Hello(String name) {
    this.message = name;
  }

}
