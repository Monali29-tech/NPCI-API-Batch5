package com.dockebatch5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class MyController {

	@GetMapping
	public String myDocker() {
		
		return "my application is running using docker";
}
}
