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
 * Table representaion for inventory_library_stone
 * 
 * @author AMAL
 *
 */
@Getter
@Setter
@Entity
@Table(name = "inventory_library_stone")
public class InventoryLibraryStone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "clarity",nullable=true)
	private String clarity;

	@Column(name = "color",nullable=true)
	private String color;
	
	@Column(name = "item_Code",nullable=false)
	private String itemCode;
	
	@Column(name = "library_id",nullable=false)
	private Long libraryId;
	
	@Column(name = "pieces",nullable=false)
	private Integer pieces;
	
	@Column(name = "pointers",nullable=true)
	private Double pointers;
	
	@Column(name = "price",nullable=true)
	private Double price;

	@Column(name = "remarks",nullable=true)
	private String remarks;

	@Column(name = "setting",nullable=true)
	private String setting;
	
	@Column(name = "shape",nullable=true)
	private String shape;
	
	@Column(name = "style_size",nullable=true)
	private Double styleSize;
	
	@Column(name = "total",nullable=true)
	private Double total;
	
	@Column(name = "weight",nullable=true)
	private Double weight;
	


}
