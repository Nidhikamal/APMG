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
 * PaymentTerms entity.
 * 
 * @author Vidya.p
 */

@Getter
@Setter
@Entity
@Table(name = "payment_terms")
public class PaymentTerms {


	@Column(name = "terms", nullable = false)
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long terms;
	
	@Column(name = "term_desc", nullable = false)
	private String termDesc;
	
	@Column(name = "due_date_type", nullable = true)
	private String dueDateType;
	
	@Column(name = "due_date_day", nullable = false)
	private Long dueDateDay;
	
	@Column(name = "disc_date_type", nullable = true)
	private String discDateType;
	
	@Column(name = "disc_date_day", nullable = true)
	private Long discDateDay;
	
	@Column(name = "disc_per", nullable = true)
	private Double discPer;
	
	@Column(name = "create_date", nullable = false)
	private Date createDate;
	
	@Column(name = "create_user", nullable = false)
	private String createUser;
	
	@Column(name = "location_code", nullable = true)
	private String locationCode;
}
