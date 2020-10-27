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
@Table(name = "inventory_library_material")
public class InventoryLibraryMaterial {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@Column(name = "library_id",nullable=false)
	private String libraryId;
	
	@Column(name = "karat",nullable=true)
	private Double karat;
	
	@Column(name = "material",nullable=true)
	private String material;
	
	@Column(name = "price",nullable=true)
	private Double price;
	
	
	@Column(name = "color",nullable=true)
	private String color;
	
	@Column(name = "weight",nullable=true)
	private Double weight;
	

}
