package com.mcx.bikedotcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcx.bikedotcatalog.entity.Locations;
import com.mcx.bikedotcatalog.service.LocationsSevice;

@RestController
@RequestMapping(value = "/locations")
public class LocationsController {

	@Autowired
	private LocationsSevice service;
	
	@GetMapping
	public ResponseEntity<List<Locations>> getAllLocations(){
		
		return ResponseEntity.ok(service.findAll());
			
	}
	
	@GetMapping(value = "/{code}")
	public ResponseEntity<Locations> getLocation(@PathVariable String code){
		
		 return ResponseEntity.ok(service.findById(code));
		
	}
	
}
