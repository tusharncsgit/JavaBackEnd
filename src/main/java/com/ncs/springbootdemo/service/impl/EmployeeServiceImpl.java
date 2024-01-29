package com.ncs.springbootdemo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ncs.springbootdemo.model.Employee;
import com.ncs.springbootdemo.repositiory.EmployeeRepository;
import com.ncs.springbootdemo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	 
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
	return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
