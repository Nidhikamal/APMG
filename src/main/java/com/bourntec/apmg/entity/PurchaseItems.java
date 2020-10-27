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
 * Table representaion for purchase_items
 * 
 * @author Priyanka
 *
 */
@Getter
@Setter
@Entity
@Table(name = "purchase_items")
public class PurchaseItems {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "purchase_no",nullable=false)
	private String purchaseNo;

	@Column(name = "vendor_code",nullable=true)
	private String vendorCode;
	
	@Column(name = "item_code",nullable=true)
	private String itemCode;
	
	@Column(name = "description",nullable=true)
    private String description;
	
	@Column(name = "no_pc_p",nullable=true)
	private Double noPcP;
	
	@Column(name = "no_pc_w",nullable=true)
	private Double noPcW;
	
	@Column(name = "unit_price",nullable=true)
	private Double unitPrice;
	
	@Column(name = "in_pc_p",nullable=true)
    private Double inPcP;
	
	@Column(name = "in_pc_w",nullable=true)
	private Double inPcW;
	
	@Column(name = "mark_up",nullable=true)
	private Double markUp;
	
	@Column(name = "location_code",nullable=true)
    private String locationCode;
	
	@Column(name = "cust_no",nullable=true)
	private String custNo;
	
}
