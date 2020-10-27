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
 * Table representaion for InventoryLibraryMMStone
 * 
 * @author Vidya
 *
 */
@Getter
@Setter
@Entity
@Table(name = "inventory_library_mm_stone")
public class InventoryLibraryMMStone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id",nullable=false)
	private Long id;

	@Column(name = "library_id",nullable=false)
	private Long libraryId;


	@Column(name = "item_code",nullable=false)
	private String itemCode;

	@Column(name = "shape",nullable=true)
	private String shape;

	@Column(name = "clarity",nullable=true)
	private String clarity;

	@Column(name = "color",nullable=true)
	private String color;

	@Column(name = "weight",nullable=true)
	private Double weight;

	@Column(name = "style_size",nullable=true)
	private String styleSize;

	@Column(name = "pointers",nullable=true)
	private Double pointers;

	@Column(name = "setting",nullable=true)
	private String setting;

	@Column(name = "pieces",nullable=true)
	private Long pieces;

	@Column(name = "price",nullable=true)
	private Double price;

	@Column(name = "total",nullable=true)
	private Double total;

	@Column(name = "remarks",nullable=true)
	private String remarks;

	@Column(name = "stone_id",nullable=true)
	private String stoneId;





}
