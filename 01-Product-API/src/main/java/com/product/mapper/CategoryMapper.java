package com.product.mapper;

import org.modelmapper.ModelMapper;

import com.product.dto.CategoryDto;
import com.product.entities.CategoryEntity;

public class CategoryMapper {
	
	// static -> same instance for all methods 
	// final -> cannot be reassigned
	// so you don't create new ModelMapper objects again and again
	public static final ModelMapper mapper = new ModelMapper();
	
	// it takes a categoryEntity and return a CategoryDto
	// it is used when sending data to the client(i.e APi response)
	public static CategoryDto convertToDto(CategoryEntity entity) {
		return mapper.map(entity,CategoryDto.class);
		
	}
	
	// it takes a DTO and converts it into an entity do it can be saved to the database
	public static CategoryEntity convertToEntity(CategoryDto dto)
 {
		
		return mapper.map(dto, CategoryEntity.class);
	}

}
