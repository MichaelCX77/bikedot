package com.mcx.bikedotregister.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mcx.bikedotregister.entity.User;
import com.mcx.bikedotregister.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers (){
		
		List<User> users = service.findAll();
		
		return ResponseEntity.ok(users);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> getUserById (@PathVariable Long id){
		
		User user = service.findById(id);
		return ResponseEntity.ok(user);
	}
	
	@GetMapping(value ="/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email) {
		
		User user = service.findByEmail(email);
		return ResponseEntity.ok(user);
	}
	
}
