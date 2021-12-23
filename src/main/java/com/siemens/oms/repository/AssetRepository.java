package com.siemens.oms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.siemens.oms.entity.Asset;
import com.siemens.oms.entity.Employee;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Integer> {

	// @Query(value = "SELECT * into new
	// ParameterResponse(parameterid,interfaceid,interfacename,interfacevalue) FROM
	// parameter p")
	@Query(value = "SELECT p  FROM Asset p where p.isactive=true and p.organizationid=:id")
	List<Asset> getAsset(@Param("id") Integer id);



}
