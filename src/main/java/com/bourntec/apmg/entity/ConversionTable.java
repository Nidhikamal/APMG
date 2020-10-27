package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "conversion_table")
public class ConversionTable {
	
	@Id
	@Column(name = "karat_value",nullable=false)
	private String karatValue;
	
	@Column(name = "conv_amt",nullable=false)
	private Double convAmt;
	
	@Column(name = "location_code",nullable=true)
	private String locationCode;
}
