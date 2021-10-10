package com.empapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.empapi.model.Employee;


public interface EmployeeService {

	List<Employee> findDepartment(String dept);
	
	void saveEmployee(Employee emp);
	
	List<Employee> getAllEmpInfo();
}
