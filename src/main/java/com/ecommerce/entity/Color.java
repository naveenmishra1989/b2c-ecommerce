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
@Table(name = "B2C_CLR")
public class Color {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String code;

	@JsonIgnoreProperties("color")
	@OneToMany(mappedBy = "color", fetch = FetchType.LAZY)
	private Set<Product> products;


}
