package com.example.flipkart.service;

import java.util.List;

import com.example.flipkart.dto.FlipkartDTO;
import com.example.flipkart.request.FlipkartRequest;

public interface FlipkartService {
	
	public String addProductFromManufacturer(List<FlipkartDTO> manufacturerProductDetails);

	public List<FlipkartDTO> getByIDProductInFlipkart(int id);

	public List<FlipkartDTO> getAllProductInFlipkart();

	public String addProductInFlipkart(List<FlipkartRequest> request);

	public String updateProductInFlipkart(FlipkartRequest request);

	public boolean deleteProductInFlipkart(int id);
}
