package com.Empoyee.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Empoyee.service.EmployeeService;
@RestController
@RequestMapping("/API/Employee")
public class EmployeeRest {
	@Autowired
	EmployeeService empsrvc;

}
