package com.demospringboot.springbootproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demospringboot.springbootproject.entity.Employee;
 
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
     
}