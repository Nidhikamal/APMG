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
 * @author Amal
 *
 */
@Getter
@Setter
@Entity
@Table(name = "asset_employee_details")
public class AssetEmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",nullable=false)
	 private Integer id;
	
	@Column(name = "asset_id",nullable=true)
	private String assetId;
	
	@Column(name = "assign_date",nullable=true)
	private Date assignDate;
	
	@Column(name = "emp_id",nullable=true)
	private String empId;
	
	@Column(name = "return_date",nullable=true)
	private Date returnDate;
	
	@Column(name = "status",nullable=true)
	private String status;

	@Column(name = "location",nullable=true)
	public String location;
	
	@Column(name = "description",nullable=true)
	public String description;
	
}
