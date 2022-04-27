package com.mcx.bikedotcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcx.bikedotcatalog.entity.AccessibilityType;

@Repository
public interface AccessibilityTypeRepository extends JpaRepository<AccessibilityType, Long>{

}
