package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
/**
 * Table representaion for proforma_billing 
 * @author Athulya Sajeev
 */
@Getter
@Setter
@Entity
@Table(name = "proforma_billing")
public class ProformaBilling {	
	@Id
	@Column(name ="proforma_no",nullable=true)
	private String proformaNo;	
	@Column(name = "address_name",nullable=true)
	private String addressName;
	@Column(name = "address1",nullable=true)
	private String address1;	
	@Column(name = "address2",nullable=true)
	private String address2;
	@Column(name = "city",nullable=true)
	private String city;	
	@Column(name = "state",nullable=true)
	private String state;
	@Column(name = "country",nullable=true)
	private String country;	 
	@Column(name = "zips",nullable=true)
	private String zips;
	@Column(name = "phone1",nullable=true)
	private String phone1;
}