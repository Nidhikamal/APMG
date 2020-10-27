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
 * VendorShippingDetails entity.
 * 
 * @author Vidya.p
 */


@Getter
@Setter
@Entity
@Table(name = "vendor_shipping_details")
public class VendorShippingDetails {

	@Column(name = "id")
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	
    @Column(name = "vendor_no", nullable = false)
	private String vendorNo;
    
    @Column(name = "ship_name", nullable = true)
	private String shipName;
    
    @Column(name = "location_code", nullable = true)
	private String locationCode;
    
    @Column(name = "ship_address1", nullable = true)
	private String shipAddress1;
    
    @Column(name = "ship_address2", nullable = true)
	private String shipAddress2;
    
    @Column(name = "ship_city", nullable = true)
	private String shipCity;
    
    @Column(name = "ship_state", nullable = true)
	private String shipState;
    
    @Column(name = "ship_country", nullable = true)
	private String shipCountry;
    
    @Column(name = "ship_zip", nullable = true)
	private Long shipZip;
    
    @Column(name = "ship_phone", nullable = true)
	private Long shipPhone;
}