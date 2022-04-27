package com.mcx.bikedotcatalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcx.bikedotcatalog.entity.CarrierType;
import com.mcx.bikedotcatalog.repository.CarrierTypeRepository;

@Service
public class CarrierTypeService {

	@Autowired
	private CarrierTypeRepository repository;
	
	public List<CarrierType> findAll(){
		return repository.findAll();
	}
	
	public CarrierType findById(Long id){
		return repository.findById(id).get();
	}
	
}
