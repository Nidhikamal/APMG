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
 * @author Babu
 */

@Getter
@Setter
@Entity
@Table(name = "vendor_item_match")
public class VendorItemMatch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "vendor_code", nullable = false)
	private String vendorCode;
	
	@Column(name = "item_code", nullable = false)
	private String itemCode;
	
	@Column(name = "vendor_no", nullable = false)
	private String vendorNo;
	
	@Column(name = "location_code", nullable = true)
	private String locatioCoode;
	
	@Column(name = "desc1", nullable = true)
	private String desc1;
	
	@Column(name = "min_order_qty", nullable = true)
	private Double minOrderQty;
	
	@Column(name = "eco_order_qty", nullable = true)
	private Double ecoOrderQty;
	
	@Column(name = "avg_lead_days", nullable = true)
	private Double avgLeadDays;
}
