package com.codeWithRaman.implementation.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeWithRaman.implementation.model.User;
import com.codeWithRaman.implementation.repository.UserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserController {

	private final UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@PostMapping
	public Mono<User> saveUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	@GetMapping
	public Flux<User> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/{id}")
	public Mono<User> findById(@PathVariable Long id) {
		return userRepository.findById(id);
	}

	@DeleteMapping("/{id}")
	public Mono<Void> delete€ById(@PathVariable Long id) {
		return userRepository.deleteById(id);
	}
}
