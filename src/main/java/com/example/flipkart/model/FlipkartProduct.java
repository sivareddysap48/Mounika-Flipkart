package com.example.flipkart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FlipkartProduct {

	@Id
	private int id;

	@Column(name="F_PRODUCT_ID")
	private String productid;
	@Column(name="F_PRODUCT_NAME")
	private String productname;
	@Column(name="F_PRODUCT_PRICE")
	private long productprice;
	
}
