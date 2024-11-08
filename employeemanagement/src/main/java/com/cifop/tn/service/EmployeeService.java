package com.cifop.tn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cifop.tn.entity.Employee;
import com.cifop.tn.exception.BadRequestException;
import com.cifop.tn.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
	EmployeeRepository employeeRepositroy;

	public Employee saveEmployee(Employee e , long id) throws BadRequestException {
		employeeRepositroy.findById(id);
		if(e.getDepartement() == null) 
		  throw new BadRequestException("Departement cannot be empty");
		return employeeRepositroy.save(e);
	}
	
	public void DeleteEmployee(long empId) {
		employeeRepositroy.deleteById(empId);
	}
	
	public Employee addEmployee(Employee e) {
		return employeeRepositroy.save(e);
	}
	
	public  List<Employee> findEpmloyee(){
		return  (List<Employee>) employeeRepositroy.findAll();
	}
	
	public Employee findEmployeeById(long id) {
		return employeeRepositroy.findById(id).get();
	}	
}
