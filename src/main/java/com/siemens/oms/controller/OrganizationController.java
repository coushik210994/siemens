/**
 * 
 */
package com.siemens.oms.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.siemens.oms.entity.Organization;
import com.siemens.oms.model.OrganizationRequest;
import com.siemens.oms.service.OrganizationService;





/**
 * @author coush
 *
 */
@RestController
public class OrganizationController {

	Logger log = LoggerFactory.getLogger(OrganizationController.class);

	@GetMapping(value = "/test")
	public Object getValue() {
		return "coushik";
	}
	
	@Autowired
	OrganizationService organizationService;
	
	@GetMapping(value = "/Organizationapi")
	public List<Organization> getOrganizations() {

		return organizationService.getOrganizations();
	}
	
	@PostMapping(value = "/Organizationapi")
	public ResponseEntity<Object> createOrganizations(@RequestBody OrganizationRequest organizationRequest) {

		organizationService.createOrganization(organizationRequest);
		  return new ResponseEntity<Object>(HttpStatus.OK);
	}

	@PutMapping(value = "/Organizationapi")
	public ResponseEntity<Object> updateOrganizations(@RequestBody OrganizationRequest organizationRequest) {

		organizationService.updateOrganization(organizationRequest);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/Organizationapi")
	public ResponseEntity<Object> deleteOrganizations(@RequestParam Integer id) {

		organizationService.deleteOrganization(id);
		 return new ResponseEntity<Object>(HttpStatus.OK);
	}


}
