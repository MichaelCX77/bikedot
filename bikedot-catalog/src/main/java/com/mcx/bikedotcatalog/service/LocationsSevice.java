package com.mcx.bikedotcatalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcx.bikedotcatalog.entity.Locations;
import com.mcx.bikedotcatalog.repository.LocationsRepository;

@Service
public class LocationsSevice {

	@Autowired
	private LocationsRepository repository;
	
	public List<Locations> findAll(){
		
		return repository.findAll();
	}

	public Locations findById(String code) {
		return repository.findById(code).get();
	}
	
}
