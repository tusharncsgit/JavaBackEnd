package com.ncs.springbootdemo.service;

import java.util.List;

import com.ncs.springbootdemo.model.Employee;


public interface EmployeeService {
	Employee saveEmployee (Employee employee);
	List<Employee> getAllEmployees();
	
	
}
