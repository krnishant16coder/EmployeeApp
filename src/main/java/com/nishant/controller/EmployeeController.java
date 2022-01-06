package com.nishant.controller;

import java.util.List;

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
	EmployeeService employeeService;
	
	@PostMapping("/save")
	public String saveEmp(@RequestBody Employee employee) {
		
		return employeeService.save(employee);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getEmp(){
		return employeeService.findAll();
	}
}
