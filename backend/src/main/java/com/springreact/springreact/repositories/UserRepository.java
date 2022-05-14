package com.springreact.springreact.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springreact.springreact.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
