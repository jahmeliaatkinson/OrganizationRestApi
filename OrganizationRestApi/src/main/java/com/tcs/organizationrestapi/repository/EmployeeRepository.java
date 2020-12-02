package com.tcs.organizationrestapi.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.organizationrestapi.model.Department;
import com.tcs.organizationrestapi.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

//	List<Employee> findByDepartment(Department department , Sort sort);

	
	
	
}
