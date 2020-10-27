package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



/**
 * CustData2 entity.
 * 
 * @author Vidya.p
 */

@Getter
@Setter
@Entity
@Table(name = "cust_data2")
public class CustData2{
	
	@Id
	@Column(name = "cust_no",nullable=false)   
	private String custNo;
	
	@Column(name = "ship_phone",nullable=true) 
	private Long shipPhone;
	
	@Column(name = "ship_address",nullable=true) 
	private String shipAddress;
	
	@Column(name = "ship_city",nullable=true) 
	private String shipCity;
	
	@Column(name = "ship_state",nullable=true) 
	private String shipState;
	
	@Column(name = "ship_zip",nullable=true) 
	private Long shipZip;
	
	@Column(name = "ship_country",nullable=true) 
	private String shipCountry;
	
	@Column(name = "priority_code",nullable=true) 
	private String priorityCode;
	
	@Column(name = "last_sale_date",nullable=true) 
	private Date lastSaleDate;
	
	@Column(name = "next_call_date",nullable=true) 
	private Date nextCallDate;
	
	@Column(name = "ship_address2",nullable=true) 
	private String shipAddress2;
	
	@Column(name = "ship_name",nullable=true) 
	private String shipName;
	
	@Column(name = "ship_zips",nullable=true) 
	private String shipZips;
	
	@Column(name = "location_code",nullable=true) 
	private String locationCode;
	
	@Column(name = "ship_phones",nullable=true) 
	private String shipPhones;
    
}