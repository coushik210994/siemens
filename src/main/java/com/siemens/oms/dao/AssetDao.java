package com.siemens.oms.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.HttpClientErrorException.BadRequest;
import org.springframework.web.server.ResponseStatusException;

import com.siemens.oms.entity.Asset;
import com.siemens.oms.model.AssetRequest;

@Repository
public class AssetDao {
	@Autowired
	com.siemens.oms.repository.AssetRepository assetRepository;

	public void createAsset(AssetRequest assetRequest) {
		Asset Asset = new Asset();
		if (!((Optional.ofNullable(assetRequest).map(AssetRequest::getAssetid).isPresent())
				&& assetRequest.getAssetid() != 0)) {
			Asset.setAssetid(assetRequest.getAssetid());
			Asset.setOrganizationid(assetRequest.getOrganizationid());
			Asset.setAssetType(assetRequest.getAssetType());
			Asset.setIsactive(true);
			assetRepository.save(Asset);

		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Asset already exists");
		}

	}

	public void updateAsset(AssetRequest assetRequest) {
		Asset Asset = new Asset();
		if ((Optional.ofNullable(assetRequest).map(AssetRequest::getAssetid).isPresent())
				&& assetRequest.getAssetid() != 0) {

			Asset.setAssetid(assetRequest.getAssetid());
			Asset.setOrganizationid(assetRequest.getOrganizationid());
			Asset.setAssetType(assetRequest.getAssetType());
			Asset.setIsactive(true);
			assetRepository.save(Asset);

		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Asset not exists");
		}

	}

	public void deleteAsset(Integer id) {
		Asset Asset = assetRepository.findById(id).get();
		if (!(ObjectUtils.isEmpty(id) && id > 0)) {
			Asset.setIsactive(false);
			assetRepository.save(Asset);
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Data Not Found");
		}

	}
}
