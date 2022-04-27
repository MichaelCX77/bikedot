package com.mcx.bikedotcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcx.bikedotcatalog.entity.Carrier;

@Repository
public interface CarriersRepository extends JpaRepository<Carrier, Long>{

}
