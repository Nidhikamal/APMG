package com.bourntec.apmg.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
/**
 * Table representaion for proforma_master 
 * @author Athulya Sajeev
 */
@Getter
@Setter
@Entity
@Table(name = "proforma_master")
public class ProformaMaster {	
	@Id
	@Column(name ="proforma_no",nullable=true)
	private String proformaNo;	
	@Column(name = "brand_id",nullable=true)
	private Long brandId;
	@Column(name = "courier_no",nullable=true)
	private String courierNo;	
	@Column(name = "created_by",nullable=true)
	private String createdBY;
	@Column(name = "created_date",nullable=true)
	private Date createdDate;	
	@Column(name = "cust_no",nullable=true)
	private String custNo;
	@Column(name = "discount",nullable=true)
	private Double discount;	
	@Column(name = "discount_per",nullable=true)
	private Double discountPer;
	@Column(name = "gross_weight",nullable=true)
	private Double grossWeight;
	@Column(name = "misc_chg_name",nullable=true)
	private String miscChgName;	
	@Column(name = "misc_chg",nullable=true)
	private Double miscChg;	
	@Column(name = "misc_chg_per",nullable=true)
	private Double miscChgPer;	
	@Column(name = "location_code",nullable=true)
	private String locationCode;	
	@Column(name = "proforma_date",nullable=true)
	private Date proformaDate;	
	@Column(name = "remarks",nullable=true)
	private String remarks;	
	@Column(name = "ship_chg",nullable=true)
	private Double shipChg;	
	@Column(name = "subtotal",nullable=true)
	private Double subtotal;	
	@Column(name = "total",nullable=true)
	private Double total;	
	@Column(name = "validity_date",nullable=true)
	private Date validityDate;
}