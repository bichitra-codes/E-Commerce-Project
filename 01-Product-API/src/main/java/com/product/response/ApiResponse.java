package com.product.response;

import lombok.Data;

@Data
public class ApiResponse<T> {

	private Integer status;     // holds HTTp status code( Ok /Not Found/Server error)
	private String message;
	private T data;           // it holds response body like(DTO/object/list)
}
