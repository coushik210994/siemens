package com.siemens.oms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.siemens.oms.entity.Organization;


@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Integer> {

	@Query(value = "SELECT p  FROM Organization p where p.isactive=true")
	List<Organization> getOrganization();

}
