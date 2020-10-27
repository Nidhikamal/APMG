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
@Table(name = "shipping_codes")
public class ShippingCodes {
	
	
    @Id
    @Column(name = "ship_code",nullable=false)
    private String shipCode;
    
    @Column(name = "ship_name",nullable=false)
	private String shipName;
    
    @Column(name = "location_code",nullable=true)
	private String locationCode;
    
    @Column(name = "track_url",nullable=true)
	private String trackUrl;
}
