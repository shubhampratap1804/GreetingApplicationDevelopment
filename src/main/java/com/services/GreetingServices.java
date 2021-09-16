package com.services;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.greeting.Greeting;
import com.example.greeting.user.User;
import com.repository.GreetingRepository;

@Service
public class GreetingServices implements IGreetingServices {

	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private GreetingRepository greetingRepository;

	@Override
	public Greeting addGreeting(User user) {
		String message = String.format(template, user.toString().isEmpty() ? "HelloWorld" : user.toString());
		return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
	}

	@Override
	public Greeting getGreetingById(long id) {
		List<Greeting> allUsers = greetingRepository.findAll();
		String message = "";
		for(Greeting greeting : allUsers) {
			if(greeting.getId() == id) {
				message = greeting.getMessage();
			}
		}
		return new Greeting(id,message);
	}
}
