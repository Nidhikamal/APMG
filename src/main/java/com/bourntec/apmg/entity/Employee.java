package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@Column(name = "emp_id",nullable=false)
	private String empId;
	
	@Column(name = "initial",nullable=true)
	private String initial;
	
	@Column(name = "name",nullable=false)
	private String name;
	
	@Column(name = "address",nullable=true)
	private String address;
	
	@Column(name = "city",nullable=true)
	private String city;
	
	@Column(name = "state",nullable=true)
	private String state;
	
	@Column(name = "phone1",nullable=true)
	private Long phone1;
	
	@Column(name = "phone2",nullable=true)
	private Long phone2;
	
	@Column(name = "comm_percent",nullable=true)
	private Double commPercent;
	
	@Column(name = "pin",nullable=true)
	private String pin;
	
	@Column(name = "zip",nullable=true)
	private Long zip;
	
	@Column(name = "emp_type",nullable=true)
	private String empType;
	
	@Column(name = "int_ext",nullable=true)
	private String intExt;
	
	@Column(name = "pay_mode",nullable=true)
	private String payMode;
	
	@Column(name = "work_type",nullable=true)
	private String workType;
	
	@Column(name = "total_due",nullable=true)
	private Double totalDue;
	
	@Column(name = "total_paid",nullable=true)
	private Double totalPaid;
	
	@Column(name = "total_employee_due",nullable=true)
	private Double totalEmployeeDue;
	
	@Column(name = "ss_no",nullable=true)
	private Long ssNo;
	
	@Column(name = "birth_date",nullable=true)
	private Date birthDate;
	
	@Column(name = "license_number",nullable=true)
	private String licenseNumber;
	
	@Column(name = "zips",nullable=true)
	private String zips;
	
	@Column(name = "location_code",nullable=true)
	private String locationCode;
	
	@Column(name = "labor",nullable=true)
	private Double labor;
	
	@Column(name = "email_address",nullable=true)
	private String emailAddress;
	
	@Column(name = "start_date",nullable=true)
	private Date startDate;
	
	@Column(name = "status",nullable=true)
	private String status;
	
	@Column(name = "phone1s",nullable=true)
	private String phone1s;
	
	@Column(name = "phone2s",nullable=true)
	private String phone2s;
	
	@Column(name = "country",nullable=true)
	private String country;
	
	@Column(name = "anniversary",nullable=true)
	private Date anniversary;
	
	@Column(name = "personal_email_address",nullable=true)
	private String personalEmailAddress;
	
	@Column(name = "end_date",nullable=true)
	private Date endDate;
	
	@Column(name = "remarks",nullable=true)
	private String remarks;
	
	@Column(name = "accounting_rep",nullable=true)
	private String accountingRep;
	
	@Column(name = "credit_card",nullable=true)
	private String creditCard;
	
	@Column(name = "emp_status",nullable=true)
	private String empStatus;
	
	@Column(name = "comments",nullable=true)
	private String comments;
	
	@Column(name = "tel_extensn",nullable=true)
	private String telExtensn;
}
