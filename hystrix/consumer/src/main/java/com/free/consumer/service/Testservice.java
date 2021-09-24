package com.free.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "SERVERPROVIDER")
public interface Testservice {

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	String hello(); 

	@RequestMapping(value="/sleep", method=RequestMethod.GET)
	String hello1(); 
	
}
