package com.siemens.oms.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siemens.oms.dao.EmployeeDao;
import com.siemens.oms.entity.Employee;
import com.siemens.oms.model.EmployeeRequest;
import com.siemens.oms.repository.EmployeeRepository;
import com.siemens.oms.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements  EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getEmployees(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployee(id);
	}

	@Override
	public void createEmployee(EmployeeRequest EmployeeRequest) {
		// TODO Auto-generated method stub
		employeeDao.createEmployee(EmployeeRequest);
	}

	@Override
	public void updateEmployee(EmployeeRequest EmployeeRequest) {
		// TODO Auto-generated method stub
		employeeDao.updateEmployee(EmployeeRequest);
		//return EmployeeRepository.updateEmployee(null, null);
		
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(id);
	}

}
