package com.bourntec.apmg.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Table representaion for payment_billing
 * 
 * @author Priyanka
 *
 */
@Getter
@Setter
@Entity
@Table(name = "payment_billing")
public class PaymentBilling {
	
	@Id
	@Column(name = "temp_id",nullable=false)
	private String tempId;

	@Column(name = "address_name",nullable=true)
    private String addressName;
	
	@Column(name = "address1",nullable=true)
    private String address1;
	
	@Column(name = "address2",nullable=true)
    private String address2;
	
	@Column(name = "city",nullable=true)
    private String city;
	
	@Column(name = "state",nullable=true)
    private String state;
	
	@Column(name = "country",nullable=true)
    private String country;

	@Column(name = "bill_name",nullable=true)
    private String billName;
	
   	@Column(name = "zips",nullable=true)
    private String zips;
   	
	@Column(name = "location_code",nullable=true)
    private String locationCode;
   	   
	@Column(name = "phone1",nullable=true)
    private String phone1;
	
	@Column(name = "email_id",nullable=true)
    private String emailId;
}

