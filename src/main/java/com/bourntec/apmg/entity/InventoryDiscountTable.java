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
 * @author Vidya.p Entity for InventoryDiscountTable
 */
@Getter
@Setter
@Entity
@Table(name = "inventory_discount_table")
public class InventoryDiscountTable {

	@Id
	@Column(name = "discount_id",nullable = false)
	private String discountId;
	

	@Column(name = "discount_desc", nullable = true)
	private String discountDesc;

	@Column(name = "created_by", nullable = true)
	private String createdBy;
	
	@Column(name = "created_date", nullable = true)
	private Date createdDate;
	
	
	@Column(name = "discount_start_date", nullable = true)
	private Date discountStartDate;
	
	@Column(name = "discount_end_date", nullable = true)
	private Date discountEndDate;
	
	@Column(name = "discount_percent", nullable = true)
	private Double discountPercent;
	
	
	@Column(name = "discount_active", nullable = true)
	private String discountActive;
	
	@Column(name = "use_customer_list", nullable = true)
	private String useCustomerList;
	
	@Column(name = "use_inventory_list", nullable = true)
	private String useInventoryList;
	
	@Column(name = "location_code", nullable = true)
	private String locationCode;
	
}
