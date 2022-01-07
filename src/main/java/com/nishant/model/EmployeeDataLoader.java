package com.nishant.model;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nishant.repository.EmployeeRepository;

@Component
public class EmployeeDataLoader {

	@Autowired
	private EmployeeRepository repository;

	@PostConstruct
	public void loadData() {

		List<Employee> employeeList = Arrays.asList(new Employee(1, "A", "aa"), new Employee(2, "B", "bb"));
		for (Employee emp : employeeList) {
			repository.save(emp);
		}
	}

}
