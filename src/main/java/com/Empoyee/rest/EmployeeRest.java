package com.Empoyee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Empoyee.entity.Employee;
import com.Empoyee.service.EmployeeService;
@RestController
@RequestMapping("/API/Employee")
public class EmployeeRest {
	@Autowired
	EmployeeService empsrvc;
	
	@PostMapping("/createEmployee")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp) {
		Employee saveemp=empsrvc.createEmployee(emp);
		return new ResponseEntity<>(saveemp, HttpStatus.CREATED);
	}
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long employeeId) {
		Employee emp=empsrvc.getEmployeeById(employeeId);
		return ResponseEntity.ok(emp);
	}
	@GetMapping("/getAllEmployee")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> employees=empsrvc.getAllEmployee();
		return ResponseEntity.ok(employees);
	}
	@PutMapping("/updateEmployee")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long employeeId, @RequestBody Employee emp){
		Employee updatedemp=empsrvc.updateEmployee(employeeId, emp);
		return new ResponseEntity(updatedemp,HttpStatus.CREATED);
	}
	@DeleteMapping("{id}")
	public String deleteEmployee(@PathVariable("id") Long employeeId) {
		empsrvc.deletEmployeeById(employeeId);
		return "delete succuss";
	}
	}


