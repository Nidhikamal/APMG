package com.bourntec.apmg.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * Table representaion for inventory_library_finding
 * 
 * @author Vidya
 *
 */
@Getter
@Setter
@Entity
@Table(name = "inventory_specs")
public class InventorySpecs {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long uniqueId;

	@Column(name = "item_code",nullable=false)
	private String itemCode;

	@Column(name = "desc",nullable=true)
	private String desc;


	@Column(name = "style_size",nullable=true)
	private String styleSize;

	@Column(name = "style_shape",nullable=true)
	private String styleShape;


	@Column(name = "desc1",nullable=true)
	private String desc1;

	@Column(name = "location_code",nullable=true)
	private String locationCode;

	@Column(name = "pieces",nullable=true)
	private Long pieces;

	@Column(name = "karat",nullable=true)
	private Double karat;

	@Column(name = "size_pointers",nullable=true)
	private Double sizePointers;

	@Column(name = "setting",nullable=true)
	private String setting;

	@Column(name = "quality",nullable=true)
	private String quality;


	@Column(name = "inv_item",nullable=true)
	private String invItem;


}
