package com.ecommerce.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "B2C_PRDCT")
public class Product {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer quantity;
	private String size;

	@Column(name = "BRND_ID")
	private Integer brandId;

	@Column(name = "CLR_ID")
	private Integer colorId;

	@Column(name = "PRDCT_CTGR_ID")
	private Integer catagoryId;

	@JsonIgnoreProperties("products")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "BRND_ID")
	private Brand brand;
	
	@JsonIgnoreProperties("products")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "CLR_ID")
	private Color color;
	
	@JsonIgnoreProperties("products")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "PRDCT_CTGR_ID")
	private ProductCategory productCategory;


}
