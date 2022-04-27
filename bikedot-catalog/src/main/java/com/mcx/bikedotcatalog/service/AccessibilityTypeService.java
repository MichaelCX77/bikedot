package com.mcx.bikedotcatalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcx.bikedotcatalog.entity.AccessibilityType;
import com.mcx.bikedotcatalog.repository.AccessibilityTypeRepository;

@Service
public class AccessibilityTypeService {

	@Autowired
	private AccessibilityTypeRepository repository;
	
	public List<AccessibilityType> findAll(){
		return repository.findAll();
	}
	
	public AccessibilityType findById(Long id){
		return repository.findById(id).get();
	}
	
}
