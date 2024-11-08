package com.cifop.tn.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cifop.tn.entity.Employee;
import com.cifop.tn.service.EmployeeService;

import jakarta.websocket.server.PathParam;


@RestController
public class EmployeeRessource {
   private static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(EmployeeRessource.class);
   @Autowired
   EmployeeService employeeservice;
   
   @GetMapping("/employees")
   public List<Employee> findAllEmployee(){
	   return employeeservice.findEpmloyee();
   }
   
   @DeleteMapping("/delete/{id}")
   public void deleteEmployee(@PathVariable("id") long id) {
	   employeeservice.DeleteEmployee(id);
   }
   
   @PostMapping("/add")
   public Employee addEmployee(@RequestBody Employee e) {
	   Logger.debug("Debug log meesage");
	   Logger.info("info log message");
	   Logger.error("error log message");
	   Logger.warn("Warn log message");
	   Logger.fatal("Fatal log message");
	   Logger.trace("trace log message");
	   return employeeservice.addEmployee(e);
   }
   
   @PutMapping("/save/{id}")
   public Employee saveEmployee(@RequestBody Employee e , @PathVariable("id") long id ) {
	   return employeeservice.saveEmployee(e , id);
   }
}