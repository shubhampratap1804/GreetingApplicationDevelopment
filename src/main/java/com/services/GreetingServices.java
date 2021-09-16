package com.services;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Service;
import com.example.greeting.Greeting;
import com.example.greeting.user.User;
import com.repository.GreetingRepository;

@Service
public class GreetingServices implements IGreetingServices {

	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	private GreetingRepository greetingRepository;

	@Override
	public Greeting addGreeting(User user) {
		String message = String.format(template, user.toString().isEmpty() ? "HelloWorld" : user.toString());
		return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
	}

	@Override
	public Greeting getGreetingById(long id) {

		return null;
	}
}
