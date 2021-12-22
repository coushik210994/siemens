/**
 * 
 */
package com.siemens.oms.model;


import org.springframework.stereotype.Component;


/**
 * @author coush
 *
 */
@Component
public class EmployeeRequest {
	
	public EmployeeRequest() {
	}
	public EmployeeRequest(Integer employeeid, Integer organizationid, String employeename, String age) {
		super();
		this.employeeid = employeeid;
		this.organizationid = organizationid;
		this.employeename = employeename;
		this.age = age;
	}

	private Integer employeeid;
	private Integer organizationid;
	private String employeename;
	private String age;
	private String salary;
	private boolean isactive;
	public Integer getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	public Integer getOrganizationid() {
		return organizationid;
	}
	public void setOrganizationid(Integer organizationid) {
		this.organizationid = organizationid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	
	

}
