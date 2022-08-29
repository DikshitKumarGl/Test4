package com.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
	@GetMapping("/login")
	public String getdoc()
	{
		return "Welcome To The Docker World";
	}
	@GetMapping("/hi")
	public String gethi()
	{
		return "This is Docker Testing 1";
	}
	@GetMapping("/bye")
	public String gebye()
	{
		return "See You Again Now exiting from Docker";
	}
}
