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

		List<Employee> employeeList = Arrays.asList(new Employee("Nishant", "SpringBoot"), new Employee("Prashant", "Java"), new Employee("NewEmployee","React"));
		for (Employee emp : employeeList) {
			repository.save(emp);
		}
		Employee emp1 = new Employee("Emp1", "Python");
		Laptop laptop1 = new Laptop("HP","2GB");
		Laptop laptop2 = new Laptop("DELL","2GB");
		emp1.setLaptops(Arrays.asList(laptop1,laptop2));
		repository.save(emp1);

	}

}
