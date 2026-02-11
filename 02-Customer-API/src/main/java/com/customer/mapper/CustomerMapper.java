package com.customer.mapper;

import org.modelmapper.ModelMapper;

import com.customer.dto.CustomerDto;
import com.customer.entity.Customer;

public class CustomerMapper {
	
	private static final ModelMapper mapper = new ModelMapper();
	
	public static CustomerDto convertToDto(Customer entity) {
		
		return mapper.map(entity, CustomerDto.class);
		
	}
	
	public static Customer ConvertToEntity(CustomerDto dto) {
		
		return mapper.map(dto, Customer.class);
	}

}
