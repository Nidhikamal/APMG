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
@Table(name = "inventory_materials_used")
public class InventoryMaterialsUsed {
	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "item_code",nullable=false)
	private String itemCode;
	
	@Column(name = "material_id",nullable=false)
	private String materialId;
	
	@Column(name = "karat_value",nullable=true)
	private Double karatValue;
	
	@Column(name = "price",nullable=true)
	private Double price;
	
	@Column(name = "color",nullable=true)
	private String color;
	
	@Column(name = "weight",nullable=true)
	private Double weight;
}
