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
 * VendorBrandDetails entity.
 * 
 * @author Vidya.p
 */


@Getter
@Setter
@Entity
@Table(name = "vendor_brand_details")
public class VendorBrandDetails {

	@Column(name = "id")
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	
    @Column(name = "vendor_no", nullable = false)
	private String vendorNo;
	
    @Column(name = "brand_id", nullable = false)
	private Long brandId;
	
    @Column(name = "status", nullable = false)
	private String status;
}