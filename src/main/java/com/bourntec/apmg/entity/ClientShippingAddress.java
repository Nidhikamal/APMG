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
 * @author Vidya.p Entity for 
 */
@Getter
@Setter
@Entity
@Table(name = "client_shipping_address")
public class ClientShippingAddress {

	@Id
	@Column(name = "repair_id" ,nullable = false)
	private String repairId;
	

	@Column(name = "address_name", nullable = true)
	private String addressName;

	@Column(name = "address1", nullable = true)
	private String address1;
	
	@Column(name = "address2", nullable = true)
	private String address2;
	
	
	@Column(name = "city", nullable = true)
	private String city;
	
	
	@Column(name = "country", nullable = true)
	private String country;
	
	@Column(name = "location_code", nullable = true)
	private String locationCode;
	
	
	@Column(name = "phone1", nullable = true)
	private String phone1;
	
	@Column(name = "ship_name", nullable = true)
	private String shipName;
	
	@Column(name = "state", nullable = true)
	private String state;
	
	@Column(name = "zips", nullable = true)
	private String zips;
	
}
