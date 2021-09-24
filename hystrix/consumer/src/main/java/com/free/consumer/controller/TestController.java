package com.free.consumer.controller;

import com.free.consumer.service.Testservice;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

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
	
    @HystrixCommand(
        commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1200")
        },
        fallbackMethod = "failback"
    )
	@GetMapping("/info1")
	public String getInfo1() {
		return testservice.hello();
	}

    public String failback() {
        return "hystrix";
    }

}