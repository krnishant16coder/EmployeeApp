package com.nishant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nishant.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
