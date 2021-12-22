package com.siemens.oms.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.HttpClientErrorException.BadRequest;
import org.springframework.web.server.ResponseStatusException;

import com.siemens.oms.entity.Employee;
import com.siemens.oms.model.EmployeeRequest;

@Repository
public class EmployeeDao {
	@Autowired
	com.siemens.oms.repository.EmployeeRepository employeeRepository;

	public void createEmployee(EmployeeRequest employeeRequest) {
		Employee Employee = new Employee();
		if (!((Optional.ofNullable(employeeRequest).map(EmployeeRequest::getEmployeeid).isPresent())
				&& employeeRequest.getEmployeeid() != 0)) {
			Employee.setEmployeeid(employeeRequest.getEmployeeid());
			Employee.setOrganizationid(employeeRequest.getOrganizationid());
			Employee.setEmployeename(employeeRequest.getEmployeename());
			Employee.setAge(employeeRequest.getAge());
			Employee.setSalary(employeeRequest.getSalary());
			Employee.setIsactive(true);
			employeeRepository.save(Employee);

		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Employee already exists");
		}

	}

	public void updateEmployee(EmployeeRequest employeeRequest) {
		Employee Employee = new Employee();
		if ((Optional.ofNullable(employeeRequest).map(EmployeeRequest::getEmployeeid).isPresent())
				&& employeeRequest.getEmployeeid() != 0) {

			Employee.setEmployeeid(employeeRequest.getEmployeeid());
			Employee.setOrganizationid(employeeRequest.getOrganizationid());
			Employee.setEmployeename(employeeRequest.getEmployeename());
			Employee.setAge(employeeRequest.getAge());
			Employee.setSalary(employeeRequest.getSalary());
			Employee.setIsactive(true);
			employeeRepository.save(Employee);

		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Employee not exists");
		}

	}

	public void deleteEmployee(Integer id) {
		Employee Employee = employeeRepository.findById(id).get();
		if (!(ObjectUtils.isEmpty(id) && id > 0)) {
			Employee.setIsactive(false);
			employeeRepository.save(Employee);
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Data Not Found");
		}

	}
}
