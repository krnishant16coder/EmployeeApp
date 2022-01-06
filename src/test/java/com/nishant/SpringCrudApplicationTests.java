package com.nishant;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.nishant.model.Employee;
import com.nishant.repository.EmployeeRepository;
import com.nishant.service.EmployeeService;

@SpringBootTest
class SpringCrudApplicationTests {

	@Autowired
	EmployeeService service;
	
	@MockBean
	EmployeeRepository repository;
	
	@Test
	public void test() {
		System.out.println("Testing successful ===");
	}
	
	@Test
	public void testFindAllMethod() {
		
		when(repository.findAll()).thenReturn(Stream.of(new Employee(1,"A", "AA"), new Employee(2,"B","BB")).collect(Collectors.toList()));
		assertEquals(2, service.findAll().size());
	}

}
