package com.bourntec.apmg.entity;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "creditcard_names")
public class CreditcardNames {
	
	
    @Id
    @Column(name = "credit_type",nullable=false)
    private String creditType;
    
    @Column(name = "card_name",nullable=false)
	private String cardName;
    
    @Column(name = "display_web",nullable=true)
	private String displayWeb;
    
    @Column(name = "card_no",nullable=true)
	private String cardNo;
    
    @Column(name = "cvv",nullable=true)
	private String cvv;
    
    @Column(name = "exp_month",nullable=true)
	private String expMonth;
    
    @Column(name = "exp_year",nullable=true)
	private String expYear;
    
    @Column(name = "emp_no",nullable=true)
	private String empNo;
    
    @Column(name = "card_type",nullable=true)
	private String cardType;
}
