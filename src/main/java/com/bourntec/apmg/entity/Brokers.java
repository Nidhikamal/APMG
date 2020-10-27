package com.bourntec.apmg.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * Brokers entity.
 * 
 * @author Vidya.p
 */

@Getter
@Setter
@Entity
@Table(name = "brokers")
public class Brokers {

 

	@Id 
	@Column(name = "broker_id",nullable=false)
	private String brokerId;
	
	 @Column(name = "broker_name",nullable=false)
	private String brokerName;
	
	 @Column(name = "description",nullable=true)
	private String description;
	 
	 @Column(name = "status",nullable=true)
	private String status;
	 
	 @Column(name = "location_code",nullable=true)
	private String locationCode;
	 
	 @Column(name = "phone",nullable=true)
	private Long phone;
	 
	 @Column(name = "birth_star",nullable=true)
	private String birthStar;
	 
	 @Column(name = "email",nullable=true)
	private String email;
	 
	 @Column(name = "small_image",nullable=true)
	private String smallImage;
	 
	 @Column(name = "large_image",nullable=true)
	private String largeImage;
}
