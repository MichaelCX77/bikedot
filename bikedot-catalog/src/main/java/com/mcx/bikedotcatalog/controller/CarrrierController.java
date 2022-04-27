package com.mcx.bikedotcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcx.bikedotcatalog.entity.Carrier;
import com.mcx.bikedotcatalog.service.CarriersService;

@RestController
@RequestMapping(value = "/carriers")
public class CarrrierController {

	@Autowired
	private CarriersService service;
	
	@GetMapping
	public ResponseEntity<List<Carrier>> getAllCarries(){
		
		return ResponseEntity.ok().body(service.findAll());
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Carrier> getCarrie(@PathVariable Long id){
		
		return ResponseEntity.ok().body(service.findById(id));
		
	}
	
}
