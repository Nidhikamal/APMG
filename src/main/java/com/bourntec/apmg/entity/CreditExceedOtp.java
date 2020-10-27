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
@Table(name = "credit_exceed_otp")
public class CreditExceedOtp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	@Column(name = "otp", nullable = false)
	private String otp;


	@Column(name = "user_id", nullable = false)
	private String userId;
	

	@Column(name = "otp_date", nullable = false)
	private Date otpDate;
	

	@Column(name = "status", nullable = true)
	private String status;
	
}

	

