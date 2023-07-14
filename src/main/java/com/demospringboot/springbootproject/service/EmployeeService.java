package com.demospringboot.springbootproject.service;

//Importing required classes
import java.util.List;

import com.demospringboot.springbootproject.entity.Employee;

//Class
public interface EmployeeService {

 // Save operation
 Employee saveEmployee(Employee employee);

 // Read operation
 List<Employee> fetchEmployeeList();

 // Update operation
 Employee updateEmployee(Employee employee, Long employeeId);

 // Delete operation
 void deleteEmployeeById(Long employeeId);
}
