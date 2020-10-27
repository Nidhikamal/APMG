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
 * Table representaion for Memo Shipping Address
 * 
 * @author jinto varghese
 *
 */
@Getter
@Setter
@Entity
@Table(name = "memo_shipping_address")
public class MemoShippingAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "memo_no")
	private String memoNo;
	
	@Column(name = "address_name")
	private String addressName;
	
	@Column(name = "address1")
	private String address1;
	
	@Column(name = "address2")
	private String address2;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "zips")
	private String zips;
	
	@Column(name = "location_code")
	private String locationCode;
	
	@Column(name = "phone1")
	private String phone1;
	
	@Column(name = "ship_name")
	private String shipName;
	
	@Column(name = "zip")
	private Long zip;
	
	@Column(name = "manifest")
	private Long manifest;
	
	
	//constructors
	
	public MemoShippingAddress(String memoNo, String addressName, String address1, String address2, String city,
			String state, String country, String zips, String locationCode, String phone1, String shipName, Long zip,
			Long manifest) {
		super();
		this.memoNo = memoNo;
		this.addressName = addressName;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zips = zips;
		this.locationCode = locationCode;
		this.phone1 = phone1;
		this.shipName = shipName;
		this.zip = zip;
		this.manifest = manifest;
	}

	public MemoShippingAddress() {
		
	}
}
