package com.siemens.oms.service;

import java.util.List;


import com.siemens.oms.entity.Employee;
import com.siemens.oms.model.EmployeeRequest;




public interface EmployeeService {

	List<Employee> getEmployees(Integer id);
	
	void createEmployee(EmployeeRequest EmployeeRequest);
	
	void updateEmployee(EmployeeRequest EmployeeRequest);
	
	void deleteEmployee(Integer id);
	
}
