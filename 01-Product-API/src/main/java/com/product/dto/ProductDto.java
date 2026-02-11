package com.product.dto;

import java.math.BigDecimal;
import java.sql.Date;

import lombok.Data;

@Data
public class ProductDto {
	
	private Integer productId;
	private String productName;
	private String productDesc;
	private String productTitles;
	private BigDecimal unitprice;
	private String imageUrl;
	private boolean active;
	private Integer unitsStock;
	private Integer catogeryId;
	private Date dateCreated;
	private Date lastUpdated;

}
