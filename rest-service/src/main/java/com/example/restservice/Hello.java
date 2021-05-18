package com.example.restservice;

import lombok.Data;

@Data
public class Hello {

  private String Message;

  public Hello(String name) {
    this.Message = name;
  }

}
