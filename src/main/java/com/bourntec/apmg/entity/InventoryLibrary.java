package com.bourntec.apmg.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * Table representaion for inv_weight
 * 
 *
 */
@Getter
@Setter
@Entity
@Table(name = "inventory_library")
public class InventoryLibrary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "style",nullable=false)
	private String style;
	
	@Column(name = "item_code",nullable=false)
	private String itemCode;
	
	@Column(name = "job_no",nullable=true)
	private String jobNo;
	
	@Column(name = "small_image",nullable=true)
	private String smallImage;
	
	@Column(name = "large_image",nullable=true)
	private String largeImage;
	
	@Column(name = "total",nullable=true)
	private Double total;
	
	@Column(name = "mark_up",nullable=true)
	private Double markUp;
	
	@Column(name = "size",nullable=true)
	private Double size;
	
	@Column(name = "webyn",nullable=true)
	private String webyn;
	
	@Column(name = "sub_category",nullable=true)
	private String subCategory;
	
	@Column(name = "location",nullable=true)
	private String location;
	
	@Column(name = "video_file",nullable=true)
	private String videoFile;
	
	@Column(name = "specification",nullable=true)
	private String specification;
	
	@Column(name = "retial_price",nullable=true)
	private Double retialPrice;
	
	@Column(name = "variant_size",nullable=true)
	private String variantSize;
	
	@Column(name = "variant_cost",nullable=true)
	private Double variantCost;
	
	@Column(name = "material_cost",nullable=true)
	private Double materialCost;
	
	@Column(name = "stone_cost",nullable=true)
	private Double stoneCost;
	
	
	@Column(name = "retail_mark_up",nullable=true)
	private Double retailMarkUp;
	
	@Column(name = "labor_cost",nullable=true)
	private Double laborCost;
	
	

	@Column(name = "labor",nullable=true)
	private String labor;
	
	
	@Column(name = "description",nullable=true)
	private String description;
	
	@Column(name = "lead_time",nullable=true)
	private Double leadTime;
	
	
	@Column(name = "display_on_apollo",nullable=true)
	private String displayOnApollo;
	

	@Column(name = "created_date",nullable=true)
	private Date createdDate;
	
	@Column(name = "retail_image",nullable=true)
	private String retailImage;
	
	
	
	

	
}
