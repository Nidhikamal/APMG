package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Amal
 *
 */
@Getter
@Setter
@Entity
@Table(name = "asset_details")
public class AssetDetails {

	@Id
	@Column(name = "id",nullable=false)
	 private String id;
	
	 @Column(name = "sl_no",nullable=true)
	 private String slNo;	
	 
	 @Column(name = "asset_type",nullable=true)
	 private String assetType;
	 
	 @Column(name = "asset_name",nullable=true)
	 private String assetName;
	 
	 @Column(name = "department",nullable=true)
	 private String department;
	 
	 @Column(name = "location",nullable=true)
	 private String location;
	 
	 @Column(name = "created_date",nullable=true)
	 private Date createdDate;
	 
	 @Column(name = "purchase_date",nullable=true)
	 private Date purchaseDate;
	 
	 @Column(name = "purchase_value",nullable=true)
	 private Double purchaseValue;
	 
	 @Column(name = "current_value",nullable=true)
	 private Double currentValue;
	 
	 @Column(name = "model_no",nullable=true)
	 private String modelNo;
	 
	 @Column(name = "warranty_type",nullable=true)
	 private String warrantyType;	
	 
	 @Column(name = "warranty_expire",nullable=true)
	 private Date warrantyExpire;
	 
	 @Column(name = "insurance_no",nullable=true)
	 private String insuranceNo;
	 
	 @Column(name = "insurer_name",nullable=true)
	 private String insurerName;
	 
	 @Column(name = "depreciation",nullable=true)
	 private Double depreciation;
	 
	 @Column(name = "image",nullable=true)
	 private String image;
	 
	 @Column(name = "status",nullable=true)
	 private String status;
	 
	 @Column(name = "description",nullable=true)
	 private String description;
	 
	 @Column(name = "vendor_id",nullable=true)
	 private String vendorId;
	 
	 @Column(name = "consumable",nullable=true)
	 private String consumable;
	
}
