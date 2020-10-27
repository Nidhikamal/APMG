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
 * Table representaion for payables_return
 * 
 * @author Priyanka
 *
 */
@Getter
@Setter
@Entity
@Table(name = "payables_return")
public class PayablesReturn {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer returnNo;

	@Column(name = "vendor_no",nullable=false)
	private String vendorNo;

	@Column(name = "return_date",nullable=true)
	private Date returnDate;
	
	@Column(name = "total",nullable=true)
    private Double total;
	
	@Column(name = "location_code",nullable=true)
    private String locationCode;
	
	@Column(name = "misc_chg_name",nullable=true)
    private String miscChgName;
	
	@Column(name = "misc_chg",nullable=true)
    private Double miscChg;
	
	@Column(name = "emp_no",nullable=true)
    private String empNo;
	
   	@Column(name = "return_description",nullable=true)
   	private String returnDescription;
   	   
   	@Column(name = "status",nullable=true)
    private String status;
	
   	@Column(name = "shipped_via",nullable=true)
    private String shippedVia;
   	
   	@Column(name = "track_no",nullable=true)
    private String trackNo;

   	@Column(name = "created_date",nullable=false)
	private Date createdDate;
   	
   	@Column(name = "mail_yn",nullable=true)
    private String mailYn;
}
