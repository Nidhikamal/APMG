package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Vidya.p Entity for PointPaidTrans
 */
@Getter
@Setter
@Entity
@Table(name = "point_paid_trans")
public class PointPaidTrans {

	@Id

	@Column(name = "payment_no")
	private String paymentNo;
	

	@Column(name = "paid_total", nullable = true)
	private Double paidTotal;


	@Column(name = "paid_date", nullable = true)
	private Date paidDate;
	

	@Column(name = "paid_mode", nullable = true)
	private String paidMode;
	

	@Column(name = "check_no", nullable = true)
	private String checkNo;
	

	@Column(name = "check_date", nullable = true)
	private Date checkDate;
	

	@Column(name = "cust_no", nullable = true)
	private String custNo;
	

	@Column(name = "credit_type", nullable = true)
	private String creditType;

	@Column(name = "paid_whom", nullable = true)
	private String paidWhom;
	

	@Column(name = "location_code", nullable = true)
	private String locationCode;
	

	@Column(name = "paid_whom_cd", nullable = true)
	private String paidWhomCd;
	

	@Column(name = "remarks", nullable = true)
	private String remarks;
	

	@Column(name = "bank_no", nullable = true)
	private String bankNo;
	

	@Column(name = "from_bank", nullable = true)
	private String fromBank;
	

	@Column(name = "to_bank", nullable = true)
	private String toBank;
	

	@Column(name = "from_account", nullable = true)
	private String fromAccount;
	

	@Column(name = "to_account", nullable = true)
	private String toAccount;
	

	@Column(name = "check_image", nullable = true)
	private String checkImage;
	

	@Column(name = "created_by", nullable = true)
	private String createdBy;
	

	@Column(name = "check_pay_no", nullable = true)
	private String checkPayNo;
	

	@Column(name = "temp_payment_no", nullable = true)
	private String tempPaymentNo;

	
	
}
