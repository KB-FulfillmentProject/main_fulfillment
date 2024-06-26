package com.ot.main.productmanagement.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ot.main.productmanagement.data.dto.MainToShopDTO;
import com.ot.main.productmanagement.data.dto.ProductManagementCompareResponseDTO;
import com.ot.main.productmanagement.data.dto.ProductManagementCreateRequestDTO;
import com.ot.main.productmanagement.data.dto.ProductManagementCreateResponseDTO;
import com.ot.main.productmanagement.data.dto.ProductManagementSelectListResponseDTO;
import com.ot.main.productmanagement.data.dto.ProductManagementSelectOneResponseDTO;
import com.ot.main.productmanagement.data.dto.ProductManagementUpdateResponseDTO;


public interface ProductManagementService{
	
	//CREATE STOCK
	public ProductManagementCreateResponseDTO createStock(String productCode);		
	
	//MODIFY STOCK
	public ProductManagementUpdateResponseDTO modifyInStock(String productCode, boolean inStatus, Integer inStock);
	
	//MODIFY OutSTOCK
	public ProductManagementUpdateResponseDTO modifyOutStock(String productCode, boolean outStatus, Integer outStock);
	
	//selectStockDetail
	public ProductManagementSelectOneResponseDTO selectStockDetail(Long id);
	
	//selectList
	public List<ProductManagementSelectListResponseDTO> selectStockList( );
	
	//Compare
	public ProductManagementCompareResponseDTO compareStockAndSafetyStock(String productCode);

	public ResponseEntity<MainToShopDTO> mainToShop(MainToShopDTO mainToShopDTO);




}
