/**
 * 
 */
package com.siemens.oms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.siemens.oms.entity.Employee;
import com.siemens.oms.model.EmployeeRequest;
import com.siemens.oms.service.EmployeeService;


/**
 * @author coush
 *
 */
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value = "/employeeapi")
	public List<Employee> getEmployees(@RequestParam Integer id) {

		return employeeService.getEmployees(id);
	}
	
	@PostMapping(value = "/employeeapi")
	public ResponseEntity<Object> createEmployees(@RequestBody EmployeeRequest employeeRequest) {

		employeeService.createEmployee(employeeRequest);
		  return new ResponseEntity<Object>(HttpStatus.OK);
	}

	@PutMapping(value = "/employeeapi")
	public ResponseEntity<Object> updateEmployees(@RequestBody EmployeeRequest employeeRequest) {

		employeeService.updateEmployee(employeeRequest);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/employeeapi")
	public ResponseEntity<Object> deleteEmployees(@RequestParam Integer id) {

		employeeService.deleteEmployee(id);
		 return new ResponseEntity<Object>(HttpStatus.OK);
	}
}
