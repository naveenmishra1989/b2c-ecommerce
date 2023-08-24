package com.ecommerce.entity;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="B2C_PRDCT_CTGR")
public class ProductCategory {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	
	@JsonIgnoreProperties("productCategory")
	@OneToMany(mappedBy = "productCategory", fetch = FetchType.LAZY)
	private Set<Product> products;

}