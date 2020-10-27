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
@Table(name = "memo_master")
public class MemoMaster {
	
    @Id
    @Column(name = "memo_no",nullable=false)
    private String memoNo;
    
    @Column(name = "memo_date",nullable=false)
	private Date memoDate;
    
    @Column(name = "emp_no",nullable=false)
	private String empNo;
    
    @Column(name = "cust_no",nullable=false)
	private String custNo;
    
    @Column(name = "sub_total",nullable=false)
	private Double subTotal;
    
    @Column(name = "discount",nullable=true)
	private Double discount;
    
    @Column(name = "discount_per",nullable=true)
	private Double discountPer;
    
    @Column(name = "misc_chg_nam1",nullable=true)
	private String miscChgNam1;
    
    @Column(name = "misc_chg1",nullable=true)
	private Double miscChg1;
    
    @Column(name = "misc_chg_nam2",nullable=true)
	private String miscChgNam2;
    
    @Column(name = "misc_chg2",nullable=true)
	private Double miscChg2;
    
    @Column(name = "created_by",nullable=false)
	private String createdBy;
    
    @Column(name = "ship_via",nullable=true)
	private String shipVia;
    
    @Column(name = "grams",nullable=true)
	private Double grams;
    
    @Column(name = "ship_chg",nullable=true)
	private Double shipChg;
    
    @Column(name = "ship_wtg",nullable=true)
	private Double shipWtg;
    
    @Column(name = "total",nullable=false)
	private Double total;
    
    @Column(name = "paid_total",nullable=true)
	private Double paidTotal;
    
    @Column(name = "paid_date",nullable=true)
	private Date paidDate;
    
    @Column(name = "ship_add",nullable=true)
	private String shipAdd;
    
    @Column(name = "status",nullable=false)
	private String status;
    
    @Column(name = "trans",nullable=true)
	private String trans;
    
    @Column(name = "total_due_now",nullable=false)
	private Double totalDueNow;
    
    @Column(name = "overdue",nullable=true)
	private Double overdue;
    
    @Column(name = "mark_up",nullable=true)
	private Double markUp;
    
    @Column(name = "return_total",nullable=true)
	private Double returnTotal;
    
    @Column(name = "desc1",nullable=true)
	private String desc1;
    
    @Column(name = "spc_sale",nullable=true)
	private String spcSale;
    
    @Column(name = "location_code",nullable=true)
	private String locationCode;
    
    @Column(name = "misc_chg_per",nullable=true)
	private Double miscChgPer;
    
    @Column(name = "validity_date",nullable=true)
	private Date validityDate;
    
    @Column(name = "pre_paid_total",nullable=true)
	private Double prePaidTotal;
    
    @Column(name = "pre_paid_date",nullable=true)
	private Date prePaidDate;
    
    @Column(name = "priority_code",nullable=true)
	private String priorityCode;
    
    @Column(name = "shipped_date",nullable=true)
	private Date shippedDate;
    
    @Column(name = "shipped",nullable=true)
	private String shipped;
    
    @Column(name = "ship_mode",nullable=true)
	private String shipMode;
    
    @Column(name = "brand_id",nullable=true)
	private Long brandId;
    
    @Column(name = "mail_sent_yn",nullable=true)
	private String mailSentYN;
    
    @Column(name = "pod_image_name",nullable=true)
	private String podImageName;
    
    @Column(name = "pod_signed_by",nullable=true)
	private String podSignedBy;
    
    @Column(name = "pod_date",nullable=true)
	private Date podDate;
    
    @Column(name = "memo_type",nullable=true)
	private String memoType;
    
    @Column(name = "account_remarks",nullable=true)
	private String accountRemarks;
    
    @Column(name = "version_no",nullable=true)
	private Long versionNo;
    
    @Column(name = "guarantee_percent",nullable=true)
	private Double guaranteePercent;
    
}
