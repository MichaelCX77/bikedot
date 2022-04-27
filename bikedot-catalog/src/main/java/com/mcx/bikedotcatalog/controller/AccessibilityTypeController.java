package com.mcx.bikedotcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcx.bikedotcatalog.entity.AccessibilityType;
import com.mcx.bikedotcatalog.service.AccessibilityTypeService;

@RestController
@RequestMapping(value = "/accessibilitytype")
public class AccessibilityTypeController {

	@Autowired
	private AccessibilityTypeService service;
	
	@GetMapping
	public ResponseEntity<List<AccessibilityType>> getAllCarries(){
		
		return ResponseEntity.ok().body(service.findAll());
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<AccessibilityType> getCarrie(@PathVariable Long id){
		
		return ResponseEntity.ok().body(service.findById(id));
		
	}
	
}
