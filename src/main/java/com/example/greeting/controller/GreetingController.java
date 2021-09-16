package com.example.greeting.controller;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.greeting.Greeting;
import com.example.greeting.user.User;

@RestController
public class GreetingController {
	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World")String name){
		return new Greeting(counter.incrementAndGet(),
				String.format(template, name));
	}
	
	@GetMapping(value = {"/","/greetingmessage","homemessage"})
	public String helloMessage(@RequestParam(value ="firstName", defaultValue ="HelloWorld!") String firstName, String lastName) {
		User user = new User();
		return user.getFirstName() + user.getLastName();
	}
}
