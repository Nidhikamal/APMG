package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Vidya.p Entity for point_sale_order_address
 */

@Getter
@Setter
@Entity
@Table(name = "point_sale_order_address")
public class PointSaleOrderAddress {
	

	@Id
	@Column(name = "order_no",nullable=false)
	private String orderNo;
	
	@Column(name = "address_type",nullable=true)
	private String addressType;
	
	@Column(name = "address1",nullable=true)
	private String desc1;
	
	@Column(name = "address2",nullable=true)
	private String address2;
	
	@Column(name = "city",nullable=true)
	private String city;
		
	@Column(name = "country",nullable=true)
	private String country;

	@Column(name = "location_code",nullable=true)
	private String locationCode;

	@Column(name = "phone1",nullable=true)
	private String phone1;

	@Column(name = "address_name",nullable=true)
	private Double addressName;

	@Column(name = "cust_no",nullable=true)
	private String custNo;
	
	@Column(name = "state",nullable=true)
	private String state;
	
	@Column(name = "zip",nullable=true)
	private String zip;
}
