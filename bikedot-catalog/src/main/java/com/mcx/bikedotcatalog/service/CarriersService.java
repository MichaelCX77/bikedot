package com.mcx.bikedotcatalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcx.bikedotcatalog.entity.Carrier;
import com.mcx.bikedotcatalog.repository.CarriersRepository;

@Service
public class CarriersService {

	@Autowired
	private CarriersRepository repository;
	
	public List<Carrier> findAll(){
		return repository.findAll();
	}
	
	public Carrier findById(Long id){
		return repository.findById(id).get();
	}
	
}
