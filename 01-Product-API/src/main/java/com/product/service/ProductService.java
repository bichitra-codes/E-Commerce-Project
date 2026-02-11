package com.product.service;

import java.util.List;

import com.product.dto.CategoryDto;
import com.product.dto.ProductDto;

public interface ProductService {
	
	// To get All the Categories
	public List<CategoryDto> findAllCategories();
	
	// To get All Product based on CategoryId
	public List<ProductDto>  findProductByCategoryId(Integer categoryId); 

	// To get Product based product Id
	public ProductDto  findByProductId(Integer ProductId);
	
	// To get Product By Product Name
	public List<ProductDto> findByProductName(String productName);
}
