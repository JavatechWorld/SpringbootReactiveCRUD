package com.codeWithRaman.implementation.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.codeWithRaman.implementation.model.User;

public interface UserRepository extends ReactiveCrudRepository<User, Long> {

}
