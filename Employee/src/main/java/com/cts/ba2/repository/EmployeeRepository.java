package com.cts.ba2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ba2.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
