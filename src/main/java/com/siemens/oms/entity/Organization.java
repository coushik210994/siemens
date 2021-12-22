/**
 * 
 */
package com.siemens.oms.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * @author coush
 *
 */
@Entity
@Table(name = "organization")
public class Organization {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer organizationid;
	private String organizationname;
	private String organizationtype;
	private boolean isactive;
	
	
	
	public Integer getOrganizationid() {
		return organizationid;
	}
	public void setOrganizationid(Integer organizationid) {
		this.organizationid = organizationid;
	}
	public String getOrganizationname() {
		return organizationname;
	}
	public void setOrganizationname(String organizationname) {
		this.organizationname = organizationname;
	}
	public String getOrganizationtype() {
		return organizationtype;
	}
	public void setOrganizationtype(String organizationtype) {
		this.organizationtype = organizationtype;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	
	
}