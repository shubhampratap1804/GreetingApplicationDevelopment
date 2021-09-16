package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.greeting.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}
