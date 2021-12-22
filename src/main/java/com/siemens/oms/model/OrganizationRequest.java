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
public class OrganizationRequest {
	
	public OrganizationRequest() {
	}
	
	private Integer organizationId;
	private String organizationName;
	private String organizationType;
	private boolean isactive;
	
	
	
	public Integer getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getOrganizationType() {
		return organizationType;
	}
	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	
}
