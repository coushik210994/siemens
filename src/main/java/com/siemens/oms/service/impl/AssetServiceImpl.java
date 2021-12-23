package com.siemens.oms.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siemens.oms.dao.AssetDao;
import com.siemens.oms.entity.Asset;
import com.siemens.oms.model.AssetRequest;
import com.siemens.oms.repository.AssetRepository;
import com.siemens.oms.service.AssetService;


@Service
public class AssetServiceImpl implements  AssetService{

	@Autowired
	AssetRepository assetRepository;
	
	@Autowired
	AssetDao assetDao;
	
	@Override
	public List<Asset> getAssets(Integer id) {
		// TODO Auto-generated method stub
		return assetRepository.getAsset(id);
	}

	@Override
	public void createAsset(AssetRequest AssetRequest) {
		// TODO Auto-generated method stub
		assetDao.createAsset(AssetRequest);
	}

	@Override
	public void updateAsset(AssetRequest AssetRequest) {
		// TODO Auto-generated method stub
		assetDao.updateAsset(AssetRequest);
		//return AssetRepository.updateAsset(null, null);
		
	}

	@Override
	public void deleteAsset(Integer id) {
		// TODO Auto-generated method stub
		assetDao.deleteAsset(id);
	}

}
