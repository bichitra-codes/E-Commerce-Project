package com.product.entities;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name= "product")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productid;
	private String productName;
	private String productDesc;
	private BigDecimal unitPrice;
	private String imageurl;
	private boolean active;
	private Integer unitsStocks;
	
	
//	@CreationTimestamp
//	@Column(updatable = false)
//	private LocalDate dateCreated;
	private Date dateCreated;
	
//	@UpdateTimestamp
//	@Column(insertable = false)
//	private LocalDate lastUpdated;
	private Date lastDate;
	
	@ManyToOne
	@JoinColumn(name = "categoryId")
	private CategoryEntity category;
	
	
	
}
