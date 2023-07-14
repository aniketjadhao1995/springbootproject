package com.demospringboot.springbootproject.controller;

import java.util.List;
//Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demospringboot.springbootproject.entity.Employee;
import com.demospringboot.springbootproject.service.EmployeeService;

//Annotation
@RestController
//Class
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// Save operation
	@PostMapping("/employees")

	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	// Read operation
	@GetMapping("/employees")

	public List<Employee> fetchEmployeeList() {
		return employeeService.fetchEmployeeList();
	}

	// Update operation
	@PutMapping("/employees/{id}")

	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("id") Long employeeId) {
		return employeeService.updateEmployee(employee, employeeId);
	}

	// Delete operation
	@DeleteMapping("/employees/{id}")

	public String deleteEmployeeById(@PathVariable("id") Long employeeId) {
		employeeService.deleteEmployeeById(employeeId);
		return "Deleted Successfully";
	}
}