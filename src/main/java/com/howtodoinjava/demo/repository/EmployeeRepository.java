package com.howtodoinjava.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.EmployeeEntity;
 
@Repository
public interface EmployeeRepository
        extends JpaRepository<EmployeeEntity, Long> {
 
	EmployeeEntity findByfirstName(String name);
	
	@Query("SELECT e FROM EmployeeEntity e WHERE e.lastName =:lastName")
	EmployeeEntity retrieveByLastName(@Param("lastName") String lastName);
}
