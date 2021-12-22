
package com.siemens.oms.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siemens.oms.entity.Organization;
import com.siemens.oms.model.OrganizationRequest;
import com.siemens.oms.service.OrganizationService;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	com.siemens.oms.repository.OrganizationRepository OrganizationRepository;

	@Autowired
	com.siemens.oms.dao.OrganizationDao OrganizationDao;

	@Override
	public List<Organization> getOrganizations() {
		return OrganizationRepository.getOrganization();
	}

	@Override
	public void createOrganization(OrganizationRequest OrganizationRequest) {
		OrganizationDao.createOrganization(OrganizationRequest);
	}

	@Override
	public void updateOrganization(OrganizationRequest OrganizationRequest) {
		OrganizationDao.updateOrganization(OrganizationRequest); 

	}

	@Override
	public void deleteOrganization(Integer id) {
		OrganizationDao.deleteOrganization(id);
	}

}
