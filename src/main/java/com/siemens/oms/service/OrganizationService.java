
package com.siemens.oms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.siemens.oms.entity.Organization;
import com.siemens.oms.model.OrganizationRequest;


@Service
public interface OrganizationService {

	List<Organization> getOrganizations();

	void createOrganization(OrganizationRequest organizationRequest);

	void updateOrganization(OrganizationRequest organizationRequest);

	void deleteOrganization(Integer id);

}
