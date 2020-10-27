package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


/**
 * VendorData entity.
 * 
 * @author Vidya.p
 */

@Getter
@Setter
@Entity
@Table(name = "vendor_data")
public class VendorData  {
	
	@Id   
	@Column(name = "vendor_no",unique = true, nullable = false)
	private String vendorNo;
	
	@Column(name = "vendor_name", nullable = false)
	private String vendorName;
	
	@Column(name = "address", nullable = true)
	private String address;
	
	@Column(name = "city", nullable = true)
	private String city;
	
	@Column(name = "state", nullable = true)
	private String state;
	
	@Column(name = "zip", nullable = true)
	private Long zip;
	
	@Column(name = "phone1", nullable = true)
	private Long phone1;
	
	@Column(name = "phone2", nullable = true)
	private Long phone2;
	
	@Column(name = "fax", nullable = true)
	private Long fax;
	
	@Column(name = "pur_acc_no", nullable = true)
	private String purAccNo;
	
	@Column(name = "terms", nullable = true)
	private Long terms;
	
	@Column(name = "comments", nullable = true)
	private String comments;
	
	@Column(name = "premium", nullable = true)
	private Double premium;
	
	@Column(name = "total_due", nullable = true)
	private Double totalDue;
	
	@Column(name = "total_paid", nullable = true)
	private Double totalPaid;
	
	@Column(name = "total_credit", nullable = true)
	private Double totalCredit;
	
	@Column(name = "address2", nullable = true)
	private String address2;
	
	@Column(name = "country", nullable = true)
	private String country;
	
	@Column(name = "status", nullable = true)
	private String status;
	
	@Column(name = "zips", nullable = true)
	private String zips;
	
	@Column(name = "location_code", nullable = true)
	private String locationCode;
	
	@Column(name = "gl_accountno", nullable = true)
	private String glAccountno;
	
	@Column(name = "merch_category", nullable = true)
	private String merchCategory;
	
	@Column(name = "email_address", nullable = true)
	private String emailAddress;
	
	@Column(name = "phone1s", nullable = true)
	private String phone1s;
	
	@Column(name = "phone2s", nullable = true)
	private String phone2s;
	
	@Column(name = "faxs", nullable = true)
	private String faxs;
	
	@Column(name = "anniversary", nullable = true)
	private Date anniversary;
	
	@Column(name = "birth_date", nullable = true)
	private Date birthDate;
	
	@Column(name = "company_url", nullable = true)
	private String companyUrl;
	
	@Column(name = "email_address2", nullable = true)
	private String emailAddress2;
	
	@Column(name = "contact_name", nullable = true)
	private String contactName;
	
	@Column(name = "contact_email", nullable = true)
	private String contactEmail;
	
	@Column(name = "phone11s", nullable = true)
	private Long phone11s;
	
	@Column(name = "bank_name", nullable = true)
	private String bankName;
	
	@Column(name = "bank_accountNo", nullable = true)	
	private String bankAccountNo;
	
	@Column(name = "bank_transaction", nullable = true)
	private String bankTransaction;	
	
	@Column(name = "company_url2", nullable = true)
	private String companyUrl2;
	
	@Column(name = "company_url3", nullable = true)
	private String companyUrl3;
	
	@Column(name = "contact_yn", nullable = true)
	private String contactYN;
}