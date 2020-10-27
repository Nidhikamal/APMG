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
 */
@Getter
@Setter
@Entity
@Table(name = "manufacture_small_stone")
public class ManufactureSmallStone {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",nullable=false)
	private Long id;	
	@Column(name = "job_no",nullable=false)
	private String jobNo;	
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
	private Double styleSize;	
	@Column(name = "pointers",nullable=true)
	private Double pointers;	
	@Column(name = "setting",nullable=true)
	private String setting;	
	@Column(name = "pieces",nullable=false)
	private Double pieces;	
	@Column(name = "price",nullable=true)
	private Double price;	
	@Column(name = "total",nullable=true)
	private Double total;	
	@Column(name = "remarks",nullable=true)
	private String remarks;	
	@Column(name = "stone_id",nullable=true)
	private String stoneId;
}