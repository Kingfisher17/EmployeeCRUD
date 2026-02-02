package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {

	// CRUD

	void add(Employee emp);

	List<Employee> display();

	Employee update(Integer id, Employee emp);

	void delete(Integer id);

}
