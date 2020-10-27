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
 * @author Athulya
 * manufacture_materials_used
 */
@Getter
@Setter
@Entity
@Table(name = "manufacture_materials_used")
public class ManufactureMaterialsUsed {	 
	@Id
	@Column(name = "id", nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	@Column(name = "job_no",nullable=true)
	private String jobNo;	
	@Column(name = "weight",nullable=true)
	private Double weight;	
	@Column(name = "material_id",nullable=true)
	private String materialId;	
	@Column(name = "karat_value",nullable=true)
	private Double karatValue;	
	@Column(name = "price",nullable=true)
	private Double price;	
	@Column(name = "color",nullable=true)
	private String color;	 
}