package com.free.provider.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

	@GetMapping("/hello")
    public String info() {
        return "world";
    }

	@GetMapping("/sleep")
    public String sleep() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        return "world";
    }
	
}
