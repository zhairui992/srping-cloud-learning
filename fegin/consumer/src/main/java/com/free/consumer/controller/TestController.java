package com.free.consumer.controller;

import com.free.consumer.service.Testservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	private Testservice testservice;

	@GetMapping("/info")
	public String getInfo() {
		return testservice.hello();
	}
	
}