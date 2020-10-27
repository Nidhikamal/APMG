package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "bank_accounts")

public class BankAccounts {

	@Id
	@Column(name = "bank_no",nullable=false)
	private String bankNo;
	
	@Column(name = "bank_name",nullable=false)
	private String bankName;
	
	@Column(name = "open_date",nullable=true)
	private Date openDate;
	
	@Column(name = "closed_date",nullable=true)
	private Date closedDate;
	
	@Column(name = "open_balance",nullable=true)
	private Double openBalance;
	
	@Column(name = "tot_debits",nullable=true)
	private Double totDebits;
	
	@Column(name = "tot_credits",nullable=true)
	private Double totCredits;
	
	@Column(name = "closing_balance",nullable=true)
	private Double closingBalance;
	
	@Column(name = "location_code",nullable=true)
	private String locationCode;
	
	@Column(name = "gl_accountno",nullable=true)
	private String glAccountno;	
}
