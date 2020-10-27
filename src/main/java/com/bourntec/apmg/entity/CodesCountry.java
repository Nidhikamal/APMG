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
@Table(name = "codes_country")
public class CodesCountry {

	@Id
	@Column(name = "country_code",nullable=false)
	private String countryCode;
	
	@Column(name = "country_name",nullable=false)
	private String countryName;

}
