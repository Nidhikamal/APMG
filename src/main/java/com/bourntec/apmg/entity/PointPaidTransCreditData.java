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
 * @author Vidya.p Entity for 
 */
@Getter
@Setter
@Entity
@Table(name = "point_paid_trans_credit_data")
public class PointPaidTransCreditData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "location_code")
	private String locationCode;
	

	@Column(name = "cust_no", nullable = true)
	private String custNo;


	@Column(name = "credit_paid_amount", nullable = true)
	private Double creditPaidAmount;
	

	@Column(name = "credit_no", nullable = false)
	private String creditNo;
	

	@Column(name = "credit_from", nullable = true)
	private String creditFrom;
	

	@Column(name = "credit_date", nullable = true)
	private Date creditDate;
	

	@Column(name = "credit_amount", nullable = true)
	private Double creditAmount;
	

	@Column(name = "payment_no", nullable = false)
	private String paymentNo;
	
	
	

	
	
}
