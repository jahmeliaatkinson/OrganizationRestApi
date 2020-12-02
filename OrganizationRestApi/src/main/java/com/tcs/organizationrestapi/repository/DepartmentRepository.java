package com.tcs.organizationrestapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.organizationrestapi.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	

	Optional<Department> findById(int Id);
	
	
}
