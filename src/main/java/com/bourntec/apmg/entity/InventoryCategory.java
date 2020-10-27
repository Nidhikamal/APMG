package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "inventory_category")
public class InventoryCategory {

	@Id
	@Column(name = "category",nullable=true)
	private String category;
	
	@Column(name = "desc1",nullable=false)
	private String desc1;
	
	@Column(name = "location_code",nullable=true)
	private String locationCode;
	
	@Column(name = "small_image",nullable=true)
	private String smallImage;
	
	@Column(name = "large_image",nullable=true)
	private String largeImage;
	
	@Column(name = "htsus",nullable=true)
	private String htsus;
	
	@Column(name = "unit_measure",nullable=false)
	private String unitMeasure;
	
	@Column(name = "packing",nullable=true)
	private String packing;
}
