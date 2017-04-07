package com.asestore.repository;

import org.springframework.data.repository.CrudRepository;

import com.asestore.domain.User;

public interface UserRepo extends CrudRepository<User, Long> {
	
	User findByUsername(String username);

}
