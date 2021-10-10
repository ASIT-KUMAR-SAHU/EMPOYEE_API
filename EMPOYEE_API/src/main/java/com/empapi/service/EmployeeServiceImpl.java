package com.empapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empapi.model.Employee;
import com.empapi.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository emprepo;
	
	@Override
	public List<Employee> findDepartment(String dept) {
		// TODO Auto-generated method stub
		
		return emprepo.findByDept(dept);
	}
	
	public void saveEmployee(Employee emp) {
		
		emprepo.save(emp);
	}
	
	public List<Employee> getAllEmpInfo() {
		return emprepo.findAll();
	}

}
