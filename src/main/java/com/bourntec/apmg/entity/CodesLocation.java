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
@Table(name = "codes_location")
public class CodesLocation {
	@Id
	@Column(name = "location_code",nullable=false)
	private String locationCode;
	
	@Column(name = "location_name",nullable=false)
	private String locationName;
	
	@Column(name = "email_id",nullable=true)
	private String emailId;

	@Column(name = "assign_email_id",nullable=true)
	private String assignedEmailId;
	
	@Column(name = "description",nullable=true)
	private String description;	
}
