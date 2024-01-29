package com.ncs.springbootdemo.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ncs.springbootdemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
