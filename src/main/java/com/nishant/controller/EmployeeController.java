package com.nishant.controller;

import java.util.List;

import com.nishant.repository.EmployeeRepository;
import com.nishant.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nishant.model.Employee;
import com.nishant.service.EmployeeService;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	LaptopRepository laptopRepository;
	
	@PostMapping("/save")
	public Employee saveEmp(@RequestBody Employee employee) {
		
		return employeeRepository.save(employee);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getEmp(){

		return employeeRepository.findAll();
	}
}
