package com.nishant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nishant.model.Employee;

@Service
public interface EmployeeService {

	String save(Employee employee);

	List<Employee> findAll();

}
