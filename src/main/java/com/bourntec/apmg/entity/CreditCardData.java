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
@Table(name = "credit_card_data")
public class CreditCardData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "unique_no")
	private Long uniqueNo;
	

	@Column(name = "cardnumber", nullable = true)
	private String cardnumber;


	@Column(name = "exponth", nullable = true)
	private String exponth;
	

	@Column(name = "expyear", nullable = true)
	private String expyear;
	

	@Column(name = "vtotal", nullable = true)
	private Double vtotal;
	

	@Column(name = "authcode", nullable = true)
	private String authcode;
	

	@Column(name = "refnumber", nullable = true)
	private String refnumber;
	

	@Column(name = "ourrefnumber", nullable = true)
	private String ourrefnumber;

	@Column(name = "ourreffrom", nullable = true)
	private String ourreffrom;
	

	@Column(name = "comment1", nullable = true)
	private String comment1;
	

	@Column(name = "comment2", nullable = true)
	private String comment2;
	

	@Column(name = "trxtype", nullable = true)
	private String trxtype;
	

	@Column(name = "tender", nullable = true)
	private String tender;
	

	@Column(name = "street", nullable = true)
	private String street;
	

	@Column(name = "zip", nullable = true)
	private String zip;
	

	@Column(name = "return_code", nullable = true)
	private Long returnCode;
	

	@Column(name = "trans_date", nullable = true)
	private Date transDate;
	

	@Column(name = "org_trxtype", nullable = true)
	private String orgTrxtype;
	

	@Column(name = "org_trans_date", nullable = true)
	private Date orgTransDate;
	

	@Column(name = "streetverified", nullable = true)
	private String streetverified;
	

	@Column(name = "zipverified", nullable = true)
	private String zipverified;

	@Column(name = "card_type", nullable = true)
	private String cardType;
	

	@Column(name = "location_code", nullable = true)
	private String locationCode;

	@Column(name = "orig_refnumber", nullable = true)
	private String origRefnumber;
	

	@Column(name = "credit_card_type", nullable = true)
	private String creditCardType;
	
}
