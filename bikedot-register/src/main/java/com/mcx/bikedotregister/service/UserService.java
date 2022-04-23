package com.mcx.bikedotregister.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcx.bikedotregister.entity.User;
import com.mcx.bikedotregister.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User findById(Long id) {
		
		User user = repository.findById(id).get();
		return user;
	}
	
	public User findByEmail(String email) {
		
		User user = repository.findByEmail(email);
		return user;
	}

	public List<User> findAll() {
		return repository.findAll();
	}

}
