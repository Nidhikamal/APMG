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
 * Table representaion for payables_debit_note
 * 
 * @author Priyanka
 *
 */
@Getter
@Setter
@Entity
@Table(name = "payables_debit_note")
public class PayablesDebitNote {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long debitNo;

	@Column(name = "payment_no",nullable=false)
	private String paymentNo;

	@Column(name = "debit_amount",nullable=true)
	private Double debitAmount;
	
	@Column(name = "vendor_no",nullable=true)
	private String vendorNo;
	
	@Column(name = "debit_date", nullable = true)
	private Date debitDate;
	
	@Column(name = "location_code",nullable=true)
	private String locationCode;
	
	@Column(name = "debit_from",nullable=true)
	private String debitFrom;
	
	@Column(name = "debit_paid_amount",nullable=true)
	private Double debitPaidAmount;
	
}
