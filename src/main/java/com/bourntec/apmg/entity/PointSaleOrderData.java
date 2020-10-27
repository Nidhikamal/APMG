package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Amal Chandra Entity for point sale order data
 */
@Getter
@Setter
@Entity
@Table(name = "point_sale_order_data")
public class PointSaleOrderData {
	
	@Id
	@Column(name = "order_no", nullable = false)
	private String orderNo;
	
	@Column(name = "desc1", nullable = true)
	private String desc1;
	
	@Column(name = "order_date", nullable = false)
	private Date orderDate;
	
	@Column(name = "emp_no", nullable = false)
	private String empNo;
	
	@Column(name = "cust_no", nullable = false)
	private String custNo;
	
	@Column(name = "sub_total", nullable = false)
	private Double subTotal;
	
	@Column(name = "discount", nullable = true)
	private Double discount;
	
	@Column(name = "discount_per", nullable = true)
	private Double discountPer;
	
	@Column(name = "misc_chg_nam1", nullable = true)
	private String miscChgNam1;
	
	@Column(name = "misc_chg1", nullable = true)
	private Double miscChg1;
	
	@Column(name = "misc_chg_nam2",nullable = true)
	private String miscChgNam2;
	
	@Column(name = "miscChg2", nullable = true)
	private Double miscChg2;
	
	@Column(name = "tax_per", nullable = false)
	private Double taxPer;
	
	@Column(name = "shi_via", nullable = true)
	private String shipVia;
	
	@Column(name = "grams", nullable = true)
	private Double grams;
	
	@Column(name = "ship_chg", nullable = true)
	private Double shipChg;
	
	@Column(name = "ship_wtg", nullable = true)
	private Double shipWtg;
	
	@Column(name = "tax", nullable = true)
	private Double tax;
	
	@Column(name = "total", nullable = false)
	private Double total;
	
	@Column(name = "terms", nullable = true)
	private Long terms;
	
	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "trans", nullable = true)
	private String trans;
	
	@Column(name = "mark_up", nullable = true)
	private Double markUp;
	
	@Column(name = "location_code", nullable = true)
	private String locationCode;
	
	@Column(name = "tax_code", nullable = true)
	private String taxCode;
	
	@Column(name = "ins_per", nullable = true)
	private Double insPer;
	
	@Column(name = "ins", nullable = true)
	private Double ins;
	
	@Column(name = "sub_total_tax", nullable = true)
	private Double subTotalTax;
	
	@Column(name = "credit_type", nullable = true)
	private String creditType;
	
	@Column(name = "cardnumber", nullable = true)
	private String cardnumber;
	
	@Column(name = "expmon", nullable = true)
	private String expmon;
	
	@Column(name = "expyear", nullable = true)
	private String expyear;
	
	@Column(name = "refnumber", nullable = true)
	private String refnumber;
	
	@Column(name = "authnumber", nullable = true)
	private String authnumber;
	
	@Column(name = "web_cust_id", nullable = true)
	private String webCustId;
	
	@Column(name = "order_paid", nullable = true)
	private String orderPaid;
	
	@Column(name = "streetverified", nullable = true)
	private String streetverified;
	
	@Column(name = "zipverified", nullable = true)
	private String zipverified;
	
	@Column(name = "order_from", nullable = true)
	private String orderFrom;
	
	@Column(name = "vsessionid", nullable = true)
	private Long vsessionid;
	
	@Column(name = "discount_id", nullable = true)
	private String discountId;
	
	@Column(name = "send_email", nullable = true)
	private String sendEmail;
	
	@Column(name = "ship_mode", nullable = true)
	private String shipMode;
	
	@Column(name = "priority_code", nullable = true)
	private String priorityCode;
	
	@Column(name = "mailorder_email", nullable = true)
	private String mailorderEmail;
	
	@Column(name = "mailorder_name", nullable = true)
	private String mailorderName;
	
	@Column(name = "mailorder_address", nullable = true)
	private String mailorderAddress;
	
	@Column(name = "remarks_new", nullable = true)
	private String remarksNew;
	
	@Column(name = "cust_empid", nullable = true)
	public String custEmpid;
	
	@Column(name = "mail_sent_yn", nullable = true)
	private String mailSentYN;
	
	@Column(name = "showcode", nullable = true)
	private String showcode;
	
	@Column(name = "promised_date", nullable = true)
	private Date promisedDate;
	
	@Column(name = "created_by", nullable = false)
	private String createdBy;
	
	@Column(name = "purchase_order", nullable = true)
	private String purchaseOrder;
	
}
