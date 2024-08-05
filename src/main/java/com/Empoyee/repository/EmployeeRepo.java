package com.Empoyee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Empoyee.entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long>{

}
