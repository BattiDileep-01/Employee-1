package com.Empoyee.service;

import java.util.List;

import com.Empoyee.entity.Employee;

public interface EmployeeService {
	
	public Employee createEmployee(Employee emp);
	public Employee getEmployeeById(long employeeId);
	public List<Employee> getAllEmployee();
	public Employee updateEmployee(long employeeId , Employee emp); 
	public String deletEmployeeById(Long employeeId);
	

}
