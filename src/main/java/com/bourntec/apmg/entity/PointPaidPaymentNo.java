package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Vidya.p Entity for 
 */
@Getter
@Setter
@Entity
@Table(name = "point_paid_payment_no")
public class PointPaidPaymentNo {

	@Id
	@Column(name = "payment_no")
	private String paymentNo;
	
	@Column(name = "inv_no", nullable = true)
	private String invNo;
	

	@Column(name = "paid_amt", nullable = true)
	private Double paidAmt;
	

	@Column(name = "paid_date", nullable = true)
	private Date PaidDate;
	
	@Column(name = "location_code", nullable = true)
	private String locationCode;
	

}
