/**
 * 
 */
package com.siemens.oms.controller;

import java.util.List;

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

import com.siemens.oms.entity.Asset;
import com.siemens.oms.model.AssetRequest;
import com.siemens.oms.service.AssetService;


/**
 * @author coush
 *
 */
@RestController
public class AssetController {

	@Autowired
	AssetService AssetService;
	
	@GetMapping(value = "/Assetapi")
	public List<Asset> getAssets(@RequestParam Integer id) {

		return AssetService.getAssets(id);
	}
	
	@PostMapping(value = "/Assetapi")
	public ResponseEntity<Object> createAssets(@RequestBody AssetRequest AssetRequest) {

		AssetService.createAsset(AssetRequest);
		  return new ResponseEntity<Object>(HttpStatus.OK);
	}

	@PutMapping(value = "/Assetapi")
	public ResponseEntity<Object> updateAssets(@RequestBody AssetRequest AssetRequest) {

		AssetService.updateAsset(AssetRequest);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/Assetapi")
	public ResponseEntity<Object> deleteAssets(@RequestParam Integer id) {

		AssetService.deleteAsset(id);
		 return new ResponseEntity<Object>(HttpStatus.OK);
	}
}
