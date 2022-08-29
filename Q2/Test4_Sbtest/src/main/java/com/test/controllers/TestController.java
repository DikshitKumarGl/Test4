package com.test.controllers;



import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;


import com.test.model.Student;



@RestController

public class TestController {

 @RequestMapping(value = "/student", method = RequestMethod.GET)

 public Student firstPage() {

Student emp = new Student();

 emp.setName("emp1");

 emp.setStandard("X");

 emp.setStdId("1");



 return emp;

 }

}

