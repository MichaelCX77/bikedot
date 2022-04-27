package com.mcx.bikedotcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcx.bikedotcatalog.entity.CarrierType;

@Repository
public interface CarrierTypeRepository extends JpaRepository<CarrierType, Long>{

}
