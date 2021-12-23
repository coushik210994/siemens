/**
 * 
 */
package com.siemens.oms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author coush
 *
 */
@Entity
@Table(name = "asset")
public class Asset {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer assetid;
	private Integer organizationid;
	private String assetType;
	private boolean isactive;
	public Integer getAssetid() {
		return assetid;
	}
	public void setAssetid(Integer assetid) {
		this.assetid = assetid;
	}
	public Integer getOrganizationid() {
		return organizationid;
	}
	public void setOrganizationid(Integer organizationid) {
		this.organizationid = organizationid;
	}
	public String getAssetType() {
		return assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	
	

	

}
