package com.siemens.oms.service;

import java.util.List;


import com.siemens.oms.entity.Asset;
import com.siemens.oms.model.AssetRequest;




public interface AssetService {

	List<Asset> getAssets(Integer id);
	
	void createAsset(AssetRequest AssetRequest);
	
	void updateAsset(AssetRequest AssetRequest);
	
	void deleteAsset(Integer id);
	
}
