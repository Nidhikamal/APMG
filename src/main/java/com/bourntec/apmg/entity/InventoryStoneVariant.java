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
 * Table representaion for inventory_stone_variant
 * 
 * @author Babu
 *
 */
@Getter
@Setter
@Entity
@Table(name = "inventory_stone_variant")
public class InventoryStoneVariant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "item_code",nullable=false)
	private String itemCode;

	@Column(name = "weight",nullable=true)
	private Double weight;
	
	@Column(name = "pieces",nullable=false)
	private Integer pieces;
	
	@Column(name = "size",nullable=false)
	private Double size;
	
	@Column(name = "stone_id",nullable=true)
	private String stoneId;
	
	@Column(name = "price",nullable=true)
	private Double price;
	
	@Column(name = "plateSize",nullable=true)
	private Short plateSize;

	@Column(name = "pointers",nullable=true)
	private Double pointers;

	@Column(name = "total_pieces",nullable=true)
	private Integer totalPieces;
	
	@Column(name = "total_weight",nullable=true)
	private Double totalWeight;
	
	@Column(name = "style_size",nullable=true)
	private Double styleSize;
	
	@Column(name = "pieces1",nullable=true)
	private Integer pieces1;
	
	@Column(name = "pieces2",nullable=true)
	private Integer pieces2;
	
	@Column(name = "pieces3",nullable=true)
	private Integer pieces3;
	
	@Column(name = "pieces4",nullable=true)
	private Integer pieces4;
	
	@Column(name = "pieces5",nullable=true)
	private Integer pieces5;
	
	@Column(name = "weight1",nullable=true)
	private Double weight1;
	
	@Column(name = "weight2",nullable=true)
	private Double weight2;
	
	@Column(name = "weight3",nullable=true)
	private Double weight3;
	
	@Column(name = "weight4",nullable=true)
	private Double weight4;
	
	@Column(name = "weight5",nullable=true)
	private Double weight5;
	
	@Column(name = "mm_size",nullable=true)
	private Double mmSize;
	
	
	

}
