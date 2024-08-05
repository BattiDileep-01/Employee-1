package com.Empoyee.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Empoyee.entity.Employee;
import com.Empoyee.exception.ResourceNotFoundException;
import com.Empoyee.repository.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepo emprepo;
	@Override
	public Employee createEmployee(Employee emp) {
		Employee saveemp=emprepo.save(emp);
		return saveemp;
	}

	@Override
	public Employee getEmployeeById(long employeeId) {
		Employee emp1=emprepo.findById(employeeId).orElseThrow(
				()->new ResourceNotFoundException("ResourceNotFoundException "+ employeeId));
		return emp1;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employees= emprepo.findAll();
		return employees.stream().collect(Collectors.toList());
	}

	@Override
	public Employee updateEmployee(long employeeId, Employee updatedemp) {
		Employee updatedemp1=emprepo.findById(employeeId).orElseThrow(
				()-> new ResourceNotFoundException("ResourceNotFoundException " +employeeId));
		updatedemp1.setEmployeeName(updatedemp.getEmployeeName());
		updatedemp1.setEmployeeAddress(updatedemp.getEmployeeAddress());
		updatedemp1.setEmployeeAge(updatedemp.getEmployeeAge());
		updatedemp1.setEmployeeSalary(updatedemp.getEmployeeSalary());
		return updatedemp1;
	}

	@Override
	public String deletEmployeeById(Long employeeId) {
		emprepo.deleteById(employeeId);
		return "delete succussusfully";
	}

}
