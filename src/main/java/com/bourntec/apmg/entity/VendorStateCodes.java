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
@Table(name = "vendor_state_codes")
public class VendorStateCodes {

	@Id
	@Column(name = "state_code", nullable = false)
	private String stateCode;
	
	@Column(name = "state_name", nullable = false)
	private String stateName;
	
	@Column(name = "display_web", nullable = true)
	private String displayWeb;
	
    @Column(name = "country_code", nullable = false)
	private  String countryCode;
}
