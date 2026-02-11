package com.product.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dto.CategoryDto;
import com.product.dto.ProductDto;
import com.product.mapper.CategoryMapper;
import com.product.mapper.ProductMapper;
import com.product.repository.CategoryRepository;
import com.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository prodRepo;
	
	@Autowired
	private CategoryRepository categRepo;

	@Override
	public List<CategoryDto> findAllCategories() {
		
		
		
		return categRepo.findAll()   // fetch all categories from DB
				.stream().
				map(CategoryMapper::convertToDto)   // convert all entity to DTO
				.collect(Collectors.toList());      // returns list of DTOs
	}

	@Override
	public List<ProductDto> findProductByCategoryId(Integer categoryId) {

			
		
		return prodRepo.findByCategoryCategoryId(categoryId)    // find all product that belong to category
				       .stream()
				       .map(ProductMapper::convertToDto)   // convert each product to DTO
				       .collect(Collectors.toList());      // return list
	}

	@Override
	public ProductDto findByProductId(Integer ProductId) {

			
		
		return prodRepo.findById(ProductId)       // try to  find  product id(returns Optional)
				.map(ProductMapper::convertToDto)
				.orElse(null);
	}

	@Override
	public List<ProductDto> findByProductName(String productName) {

			
	
		return prodRepo.findByProductNameContaining(productName)    // search product whose name contains given text
				       .stream()
				       .map(ProductMapper::convertToDto)
				       .collect(Collectors.toList());
	}

}
