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
 * @author Athulya Sajeev
 * Table representaion for proforma_shipping
 */
@Getter
@Setter
@Entity
@Table(name = "proforma_shipping")
public class ProformaShipping {	
	@Id
	@Column(name ="proforma_no",nullable=true)
	private String proformaNo;	
	@Column(name = "address",nullable=true)
	private String address;
	@Column(name = "city",nullable=true)
	private String city;	
	@Column(name = "company_name",nullable=true)
	private String companyName;
	@Column(name = "contact_person",nullable=true)
	private String contactPerson;	
	@Column(name = "country",nullable=true)
	private String country;
	@Column(name = "state",nullable=true)
	private String state;	
	@Column(name = "phone",nullable=true)
	private String phone;
	@Column(name = "zip",nullable=true)
	private String zip;	
	@Column(name = "address2",nullable=true)
	private String address2;	
	@Column(name = "location_code",nullable=true)
	private String locationCode;	 
}