package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.Getter;
import lombok.Setter;


/**
 * VendorEmployees entity.
 * 
 * @author Vidya.p
 */

@Getter
@Setter
@Entity
@Table(name = "vendor_employees")
public class VendorEmployees {

	@Column(name = "id")
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	
	@Column(name = "vendor_no", nullable = false)
	private String vendorNo;
	
	@Column(name = "emp_id", nullable = false)
	private String empId;
	
	@Column(name = "emp_name", nullable = true)
	private String empName;
	
	@Column(name = "emp_type", nullable = true)
	private String empType;
	
	@Column(name = "emp_cell", nullable = true)
	private String empCell;
	
	@Column(name = "emp_mail", nullable = true)
	private String empMail;
	
	@Column(name = "dob", nullable = true)
	private Date dob;
}