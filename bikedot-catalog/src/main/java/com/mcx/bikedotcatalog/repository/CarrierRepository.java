package com.mcx.bikedotcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcx.bikedotcatalog.entity.Carrier;

@Repository
public interface CarrierRepository extends JpaRepository<Carrier, Long>{

}
