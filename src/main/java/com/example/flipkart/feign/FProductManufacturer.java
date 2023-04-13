package com.example.flipkart.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.flipkart.response.Response;

@FeignClient(name="warehouseproduct",url="localhost:8080")
public interface FProductManufacturer {

	@GetMapping("/getallproducts")
	public Response getuserDetailsFromUserService();
}
