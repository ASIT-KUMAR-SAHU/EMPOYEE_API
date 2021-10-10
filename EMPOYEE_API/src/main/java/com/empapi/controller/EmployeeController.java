package com.empapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.empapi.model.Employee;
import com.empapi.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empservice;
	
	@GetMapping("/")
	public String testApi() {
		return "application running......";
	}
	
	@GetMapping("/get")
	public List<Employee> getAllEmployee(){
		
		return empservice.getAllEmpInfo();
	}

	@PostMapping("/save")
	public String saveEmp(@RequestBody Employee emp) {
		
		empservice.saveEmployee(emp);
		
		return "emp saved.....";
	}
	
	@GetMapping("/getemp/{dept}")
	public List<Employee> empByDept(@PathVariable String dept){
		
		return empservice.findDepartment(dept);
		
	}
}
