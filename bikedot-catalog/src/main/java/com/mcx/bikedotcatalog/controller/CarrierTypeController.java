package com.mcx.bikedotcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcx.bikedotcatalog.entity.CarrierType;
import com.mcx.bikedotcatalog.service.CarrierTypeService;

@RestController
@RequestMapping(value = "/carriertype")
public class CarrierTypeController {

	@Autowired
	private CarrierTypeService service;
	
	@GetMapping
	public ResponseEntity<List<CarrierType>> getAllCarries(){
		
		return ResponseEntity.ok().body(service.findAll());
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CarrierType> getCarrie(@PathVariable Long id){
		
		return ResponseEntity.ok().body(service.findById(id));
		
	}
	
}
