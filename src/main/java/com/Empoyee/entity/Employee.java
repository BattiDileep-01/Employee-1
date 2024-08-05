package com.Empoyee.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private int employeeAge;
	private Long employeeSalary; 

}
