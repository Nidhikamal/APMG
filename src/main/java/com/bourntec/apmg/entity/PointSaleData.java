/**
 * 
 */
package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Nince
 *
 */
@Getter
@Setter
@Entity
@Table(name = "point_sale_data")
public class PointSaleData {

	@Id
	@Column(name = "inv_no", nullable = false)
	private String invNo;
	
	@Column(name = "\"desc\"", nullable = true)
	private String desc;
	
	@Column(name = "inv_date", nullable = false)
	private Date invDate;
	
	@Column(name = "emp_no", nullable = false)
	private String empNo;
	
	@Column(name = "cust_no", nullable = false)
	private String custNo;
	
	@Column(name = "purchase_no", nullable = true)
	private String purchaseNo;
	
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
	
	@Column(name = "misc_chg_nam2", nullable = true)
	private String miscChgNam2;
	
	@Column(name = "misc_chg2", nullable = true)
	private Double miscChg2;
	
	@Column(name = "tax_per", nullable = true)
	private Double taxPer;
	
	@Column(name = "ship_via", nullable = true)
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
	
	@Column(name = "paid_total", nullable = true)
	private Double paidTotal;
	
	@Column(name = "paid_date", nullable = true)
	private Date paidDate;
	
	@Column(name = "ship_add", nullable = true)
	private String shipAdd;
	
	@Column(name = "terms", nullable = true)
	private Long terms;
	
	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "trans", nullable = false)
	private String trans;
	
	@Column(name = "total_due_now", nullable = false)
	private Double totalDueNow;
	
	@Column(name = "overdue", nullable = true)
	private Double overdue;
	
	@Column(name = "mark_up", nullable = true)
	private Double markUp;
	
	@Column(name = "return_total", nullable = true)
	private Double returnTotal;
	
	@Column(name = "desc1", nullable = true)
	private String desc1;
	
	@Column(name = "spc_sale", nullable = true)
	private String spcSale;
	
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
	
	@Column(name = "web_cust_id", nullable = true)
	private String webCustId;
	
	@Column(name = "misc_chg_per", nullable = true)
	private Double miscChgPer;
	
	@Column(name = "due_date", nullable = true)
	private Date dueDate;
	
	@Column(name = "due_discount", nullable = true)
	private Double dueDiscount;
	
	@Column(name = "due_disc_amount", nullable = true)
	private Double dueDiscAmount;
	
	@Column(name = "ref_number", nullable = true)
	private String refNumber;
	
	@Column(name = "gl_accountno", nullable = true)
	private String glAccountno;
	
	@Column(name = "pre_paid_total", nullable = true)
	private Double prePaidTotal;
	
	@Column(name = "pre_paid_date", nullable = true)
	private Date prePaidDate;
	
	@Column(name = "priority_code", nullable = true)
	private String priorityCode;
	
	@Column(name = "required_date", nullable = true)
	private Date requiredDate;
	
	@Column(name = "shipped_date", nullable = true)
	private Date shippedDate;
	
	@Column(name = "shipped", nullable = true)
	private String shipped;
	
	@Column(name = "descn", nullable = true)
	private String descn;
	
	@Column(name = "ship_mode", nullable = true)
	private String shipMode;
	
	@Column(name = "brand_id", nullable = true)
	private Long brandId;
	
	@Column(name = "mail_sent_yn", nullable = true)
	private String mailSentYN;
	
	@Column(name = "pod_image_name", nullable = true)
	private String podImageName;
	
	@Column(name = "pod_signed_by", nullable = true)
	private String podSignedBy;
	
	@Column(name = "pod_date", nullable = true)
	private Date podDate;
	
	@Column(name = "inv_type", nullable = true)
	private String invType;
	
	@Column(name = "account_remarks", nullable = true)
	private String accountRemarks;
	
	@Column(name = "created_by", nullable = false)
	private String createdBy;
	
	@Column(name = "memo_no", nullable = true)
	private String memoNo;
	
	@Column(name = "memo_master_no", nullable = true)
	private String memoMasterNo;
	
	@Column(name = "version_no", nullable = true)
	private Long versionNo;
	
	@Column(name = "customer_purchase_no", nullable = true)
	private String customerPurchaseNo;
	
	@Column(name = "active_user", nullable = true)
    private String activeUser;
	
	@Column(name = "user_time", nullable = true)
    private Date userTime;

}
