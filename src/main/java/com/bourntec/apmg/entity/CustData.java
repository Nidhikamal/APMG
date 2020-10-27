
/**
 * Entity class for cust_data
 *  
 * @author Vidya.p
 *
 */
package com.bourntec.apmg.entity;

/**
 * CustData entity.
 * 
 * @author Vidya.p
 */
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
@Table(name = "cust_data")
public class CustData {
	
	@Id
	@Column(name = "cust_no",nullable=false)                   
	private String custNo;
	
	@Column(name = "cust_name",nullable=true)
	private String custName;
	
	@Column(name = "contact_1",nullable=true)
	private String contact1;
	
	@Column(name = "phone_1",nullable=true)
	private Long phone1;
	
	@Column(name = "phone_2",nullable=true)
	private Long phone2;
	
	@Column(name = "address",nullable=true)
	private String address;
	
	@Column(name = "city",nullable=true)
	private String city;
	
	@Column(name = "state",nullable=true) 
	private String state;
	
	@Column(name = "zip",nullable=true) 
	private Long zip;
	
	@Column(name = "terms_days",nullable=true) 
	private Long termsDays;
	
	@Column(name = "credit_limit",nullable=true) 
	private Double creditLimit;
	
	@Column(name = "gold_premium",nullable=true) 
	private Double goldPremium;
	
	@Column(name = "ship_via",nullable=true) 
	private String shipVia;
	
	@Column(name = "join_date",nullable=true) 
	private Date joinDate;
	
	@Column(name = "sales_person",nullable=true) 
	private String salesPerson;
	
	@Column(name = "priority",nullable=true) 
	private String priority;
	
	@Column(name = "description",nullable=true) 
	private String description;
	
	@Column(name = "total_due",nullable=true) 
	private Double totalDue;
	
	@Column(name = "total_paid",nullable=true) 
	private Double totalPaid;
	
	@Column(name = "total_credit",nullable=true) 
	private Double totalCredit;
	
	@Column(name = "mark_up",nullable=true) 
	private Double markUp;
	
	@Column(name = "address2",nullable=true) 
	private String address2;
	
	@Column(name = "country",nullable=true) 
	private String country;
	
	@Column(name = "status",nullable=true) 
	private String status;
	
	@Column(name = "zips",nullable=true) 
	private String zips;
	
	@Column(name = "location_code",nullable=true) 
	private String locationCode;
	
	@Column(name = "gl_accountno",nullable=true) 
	private String glAccountno;
	
	@Column(name = "email_address1",nullable=true) 
	private String emailAddress1;
	
	@Column(name = "email_address2",nullable=true) 
	private String emailAddress2;
	
	@Column(name = "close_date",nullable=true) 
	private Date closeDate;
	
	@Column(name = "closing_reason",nullable=true) 
	private String closingReason;
	
	@Column(name = "emp_id",nullable=true) 
	private String empId;
	
	@Column(name = "active",nullable=true) 
	private String active;
	
	@Column(name = "login_password",nullable=true) 
	private String loginPassword;
	
	@Column(name = "price_list_id",nullable=true) 
	private String priceListId;
	
	@Column(name = "division",nullable=true) 
	private String division;
	
	@Column(name = "group",nullable=true) 
	private String group;
	
	@Column(name = "group1",nullable=true) 
	private String group1;
	
	@Column(name = "phone_1s",nullable=true)
	private String phone1s;
	
	@Column(name = "phone_2s",nullable=true)
	private String phone2s;
	
	@Column(name = "anniversary",nullable=true) 
	private Date anniversary;
	
	@Column(name = "birth_date",nullable=true) 
	private Date birthDate;
	
	@Column(name = "web_customer",nullable=true) 
	private String webCustomer;
	
	@Column(name = "tax",nullable=true) 
	private String tax;
	
	@Column(name = "company_code",nullable=true) 
	private String companyCode;
	
	@Column(name = "company_url",nullable=true) 
	private String companyUrl;
	
	@Column(name = "country_code1",nullable=true) 
	private Integer countryCode1;
	
	@Column(name = "country_code2",nullable=true) 
	private Integer countryCode2;
	
	@Column(name = "rank",nullable=true) 
	private String rank;
	
	@Column(name = "web_access",nullable=true) 
	private String webAccess;
	
	@Column(name = "cust_status",nullable=true) 
	private String custStatus;
	
	@Column(name = "statement_type",nullable=true) 
	private String statementType;
	
	@Column(name = "accounts_manager",nullable=true) 
	private String accountsManager;
}
