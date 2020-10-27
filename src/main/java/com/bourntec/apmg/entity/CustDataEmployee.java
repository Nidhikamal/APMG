package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * CustDataEmployee entity.
 * 
 * @author Vidya.p
 */

@Getter
@Setter
@Entity
@Table(name = "cust_data_employee")
public class CustDataEmployee  {

	@Id
	@Column(name = "emp_id",nullable=false)   
	private String empId;
	
	@Column(name = "cust_no",nullable=false)
	private String custNo;
	
	@Column(name = "emp_name",nullable=true)
	private String empName;
	
	@Column(name = "emp_cell",nullable=true)
	private String empCell;
	
	@Column(name = "emp_type",nullable=true)
	private String empType;
	
	@Column(name = "emp_mail",nullable=true)
	private String empMail;	
	
	@Column(name = "status",nullable=true)
	private String status;
	
	@Column(name = "cust_status",nullable=true)
	private String custStatus;
}