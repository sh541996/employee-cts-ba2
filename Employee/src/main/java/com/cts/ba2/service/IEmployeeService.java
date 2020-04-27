package com.cts.ba2.service;

import java.util.List;
import java.util.Optional;

import com.cts.ba2.model.Employee;

public interface IEmployeeService {

	public abstract void addEmployee(Employee employee);

	public abstract List<Employee> listOfEmployee();
	
	public abstract Optional<Employee> findById(Long id);

	public abstract String updateEmployee(Long id, Employee employee);

	public abstract String deleteEmployee(Long id);
}
