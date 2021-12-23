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
public class AssetRequest {
	
	public AssetRequest() {
	}
	public AssetRequest(Integer assetid, Integer organizationid, String assetType) {
		super();
		this.assetid = assetid;
		this.organizationid = organizationid;
		this.assetType = assetType;
	}

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
