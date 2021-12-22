package com.siemens.oms.dao;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;
import org.springframework.web.server.ResponseStatusException;

import com.siemens.oms.entity.Organization;
import com.siemens.oms.model.OrganizationRequest;



@Repository
public class OrganizationDao {

	@Autowired
	com.siemens.oms.repository.OrganizationRepository OrganizationRepository;

	public void createOrganization(OrganizationRequest organizationRequest) {
		Organization Organizations = new Organization();

		if (!((Optional.ofNullable(organizationRequest).map(OrganizationRequest::getOrganizationId).isPresent())
				&& organizationRequest.getOrganizationId() != 0)) {

			Organizations.setOrganizationid(organizationRequest.getOrganizationId());
			Organizations.setOrganizationname(organizationRequest.getOrganizationName());
			Organizations.setOrganizationtype(organizationRequest.getOrganizationType());
			Organizations.setIsactive(true);
			OrganizationRepository.save(Organizations);
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Organization already exists");
		}

	}

	public void updateOrganization(OrganizationRequest organizationRequest) {
		Organization Organizations = new Organization();

		if ((Optional.ofNullable(organizationRequest).map(OrganizationRequest::getOrganizationId).isPresent())
				&& organizationRequest.getOrganizationId() != 0) {

			Organizations.setOrganizationid(organizationRequest.getOrganizationId());
			Organizations.setOrganizationname(organizationRequest.getOrganizationName());
			Organizations.setOrganizationtype(organizationRequest.getOrganizationType());
			Organizations.setIsactive(true);
			OrganizationRepository.save(Organizations);
			;
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Organization not exists");
		}

	}

	public void deleteOrganization(Integer id) {
		Organization Organizations = OrganizationRepository.findById(id).get();
		if (!(ObjectUtils.isEmpty(id) && id > 0)) {
			Organizations.setIsactive(false);
			OrganizationRepository.save(Organizations);
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Data Not Found");
		}

	}
}
