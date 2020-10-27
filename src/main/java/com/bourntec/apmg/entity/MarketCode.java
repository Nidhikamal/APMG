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
@Table(name = "market_code")
public class MarketCode {
	
	@Id
	@Column(name = "market_code",nullable=false)
	private String marketCode;
	
	@Column(name = "market_name",nullable=false)
	private String marketName;
	
	@Column(name = "desc1",nullable=false)
	private String desc1;
	
	@Column(name = "location_code",nullable=false)
	private String locationCode;
}
