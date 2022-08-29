package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProfileController {

 @Value("${uname}")

 public String name;

 @GetMapping("/ab")

  private String sayHello()

  {

  return "Cloud Client Application "+name;

  }

}