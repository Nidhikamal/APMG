package com.bourntec.apmg.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
/**
 * CustDataNotes entity.
 * 
 * @author Vidya.p
 */

@Getter
@Setter
@Entity
@Table(name = "cust_data_notes")
public class CustDataNotes  {

	@Id
	@Column(name = "cust_no",nullable=false) 
	private String custNo;
	
	@Column(name = "cust_notes",nullable=true) 
	private byte[] custNotes;
	
	@Column(name = "location_code",nullable=true) 
	private String locationCode;
}