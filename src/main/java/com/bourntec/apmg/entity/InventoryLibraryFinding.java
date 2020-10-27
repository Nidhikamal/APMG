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
@Table(name = "inventory_library_finding")
public class InventoryLibraryFinding {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "item_code",nullable=false)
	private String itemCode;
	
	@Column(name = "library_id",nullable=false)
	private Long libraryId;
	
	@Column(name = "karat",nullable=true)
	private Double karat;
	
	@Column(name = "material",nullable=true)
	private String material;
	
	@Column(name = "pieces",nullable=true)
	private Long pieces;
	
	@Column(name = "price",nullable=true)
	private Double price;
	
	@Column(name = "total",nullable=true)
	private Double total;
	
	@Column(name = "wt_piece",nullable=true)
	private Double wtPiece;
	

}
