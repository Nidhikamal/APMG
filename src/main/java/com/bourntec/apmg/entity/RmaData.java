package com.bourntec.apmg.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * Entity class for rma_data 
 * @author Tinu
 *
 */
@Getter
@Setter
@Entity
@Table(name = "rma_data")
public class RmaData {
	@Id
	@Column(name = "rma_no")
	private String rmaNo;
	
	@Column(name = "rma_date")
	private LocalDate rmaDate;
	
	@Column(name = "emp_no")
	private String empNo;
	
	@Column(name = "cust_no")
	private String custNo;
	
	private double total;
	
	private String desc1;
	
	@Column(name = "item_total")
	private double itemTotal;
	
	@Column(name = "location_code")
	private String locationCode;
	
	@Column(name = "tracking_code")
	private String trackingCode;
	
	@Column(name = "ship_via")
	private String shipVia;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private LocalDate createdDate;
	
	@Column(name = "modified_by")
	private String modifiedBy;
	
	@Column(name = "modified_date")
	private LocalDate modifiedDate;
	
	@Column(name = "mail_sent_yn")
	private String mailSentYN;

}
