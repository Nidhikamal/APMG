package com.bourntec.apmg.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
/**
 * Incidents entity.
 * 
 * @author Vidya.p
 */

@Getter
@Setter
@Entity
@Table(name = "incidents")
public class Incidents {


	@Column(name = "incident_id")
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long incidentId;
	
	@Column(name = "subject",nullable=true)
	private String subject;
	
	@Column(name = "description",nullable=true)
	private String description;
	
	@Column(name = "reported_date",nullable=true)
	private Date reportedDate;
	
	@Column(name = "reported_by",nullable=true)
	private String reportedBy;
	
	@Column(name = "assigned_to",nullable=true)
	private String assignedTo;
	
	@Column(name = "assigned_id",nullable=true)
	private String assignedId;
	
	@Column(name = "created_by",nullable=false)
	private String createdBy;
}


