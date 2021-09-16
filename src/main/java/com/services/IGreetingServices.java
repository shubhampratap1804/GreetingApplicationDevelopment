package com.services;

import com.example.greeting.Greeting;
import com.example.greeting.user.User;

public interface IGreetingServices {

	Greeting addGreeting(User user);

	Greeting getGreetingById(long id);
}
