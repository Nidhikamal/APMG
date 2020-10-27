package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "return_data")
public class ReturnData {
	
	@Id
	@Column(name = "return_no", nullable = false)
	private String returnNo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "return_date", nullable = false)
	private Date returnDate;

	@Column(name = "emp_no", nullable = false)
	private String empNo;
	
	@Column(name = "cust_no", nullable = false)
	private String custNo;
	
	@Column(name = "misc_name", nullable = true)
	private String miscName;
	
	@Column(name = "misc_chg", nullable = true)
	private Double miscChg;
	
	@Column(name = "total", nullable = true)
	private Double total;
	
	@Column(name = "\"desc\"",nullable=true) 
	private String desc;
	 
	@Column(name = "item_total", nullable = true)
	private Double itemTotal;
	
	@Column(name = "desc1", nullable = true)
	private String desc1;
	
	@Column(name = "location_code", nullable = true)
	private String locationCode;
	
	@Column(name = "tracking_code", nullable = true)
	private String trackingCode;
	
	@Column(name = "return_mat_auth", nullable = true)
	private String returnMatAuth;
	
	@Column(name = "ship_via", nullable = true)
	private String shipVia;
	
	@Column(name = "external_desc", nullable = true)
	private String externalDesc;
	
	@Column(name = "created_date", nullable = false)
	private Date createdDate;
	
	@Column(name = "created_by", nullable = false)
	private String createdBy;
	
	@Column(name = "modified_date", nullable = true)
	private Date modifiedDate;
	
	@Column(name = "modified_by", nullable = true)
	private String modifiedBy;
	
	@Column(name = "return_from_show_yn", nullable = true)
	private String returnFromShowYN;
	
	@Column(name = "status", nullable = true)
	private String status;
	
	@Column(name = "return_to", nullable = true)
	private String returnTo;
	
	@Column(name = "mail_sent_yn", nullable = true)
	private String mailSentYN;
	
	@Column(name = "return_memo", nullable = true)
	private String returnMemo;
	
	@Column(name = "memo_no", nullable = true)
	private String memoNo;
	
	@Column(name = "version_no", nullable = true)
	private Long versionNo;
	
	@Column(name = "parcel_no", nullable = true)
	private String parcelNo;
	
	@Column(name = "to_show", nullable = true)
	private String toShow;

}
