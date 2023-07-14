package com.demospringboot.springbootproject.service;

// Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demospringboot.springbootproject.entity.Employee;
import com.demospringboot.springbootproject.repository.EmployeeRepository;
 
// Annotation
@Service
// Class implementing EmployeeService class
public class EmployeeServiceImpl implements EmployeeService {
 
    @Autowired
    private EmployeeRepository employeeRepository;
 
    // Save operation
    @Override
    public Employee saveEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }
 
    // Read operation
    @Override public List<Employee> fetchEmployeeList()
    {
        return (List<Employee>)
            employeeRepository.findAll();
    }
 
    // Update operation
    @Override
    public Employee
    updateEmployee(Employee employee, Long employeeId)
    {
        Employee emp = employeeRepository.findById(employeeId).get();
 
        if(Objects.nonNull(employee.getEmployeeFirstName()) && !"".equalsIgnoreCase(employee.getEmployeeFirstName())) {
        	emp.setEmployeeFirstName(employee.getEmployeeFirstName());
        }
        
        if(Objects.nonNull(employee.getEmployeeLastName()) && !"".equalsIgnoreCase(employee.getEmployeeLastName())) {
        	emp.setEmployeeLastName(employee.getEmployeeLastName());
        }
        
        if(Objects.nonNull(employee.getEmployeeEmail()) && !"".equalsIgnoreCase(employee.getEmployeeEmail())) {
        	emp.setEmployeeEmail(employee.getEmployeeEmail());
        }
        
        if(Objects.nonNull(employee.getEmployeeAge()) && !"".equalsIgnoreCase(employee.getEmployeeAge())) {
        	emp.setEmployeeAge(employee.getEmployeeAge());
        }
        
 
        return employeeRepository.save(emp);
    }
 
    // Delete operation
    @Override
    public void deleteEmployeeById(Long employeeId)
    {
        employeeRepository.deleteById(employeeId);
    }
}
