package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ad_items")
public class AdItems {

	@Id
	@Column(name = "id",nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ad_id",nullable=true)
	private Integer adId;

	@Column(name = "item_code",nullable=false)
	private String itemCode;

	@Column(name = "sales_price",nullable=true)
	private Double salesPrice;

	@Column(name = "product_title",nullable=true)
	private String productTitle;
	
	@Column(name = "description",nullable=true)
	private String description;
}
