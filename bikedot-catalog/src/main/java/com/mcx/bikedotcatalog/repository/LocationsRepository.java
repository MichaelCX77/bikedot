package com.mcx.bikedotcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcx.bikedotcatalog.entity.Locations;

@Repository
public interface LocationsRepository extends JpaRepository<Locations, String>{

}
