package com.demospringboot.springbootproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Employee {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long employeeId;
	    private String employeeFirstName;
		private String employeeLastName;
	    private String employeeEmail;
	    private String employeeAge;
	    public Long getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(Long employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeFirstName() {
			return employeeFirstName;
		}
		public void setEmployeeFirstName(String employeeFirstName) {
			this.employeeFirstName = employeeFirstName;
		}
		public String getEmployeeLastName() {
			return employeeLastName;
		}
		public void setEmployeeLastName(String employeeLastName) {
			this.employeeLastName = employeeLastName;
		}
		public String getEmployeeEmail() {
			return employeeEmail;
		}
		public void setEmployeeEmail(String employeeEmail) {
			this.employeeEmail = employeeEmail;
		}
		public String getEmployeeAge() {
			return employeeAge;
		}
		public void setEmployeeAge(String employeeAge) {
			this.employeeAge = employeeAge;
		}
	}
