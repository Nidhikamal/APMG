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
 * Table representaion for potential_vendor
 * 
 * @author Priyanka
 *
 */
@Getter
@Setter
@Entity
@Table(name = "potential_vendor")
public class PotentialVendor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "vendor_name",nullable=true)
	private String vendorName;
	
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
	
	@Column(name = "zip",nullable=true)
    private String zip;
	
	@Column(name = "phone",nullable=true)
    private String phone;
	
	@Column(name = "notes",nullable=true)
    private String notes;
	
	@Column(name = "created_date",nullable=false)
	private Date createdDate;
	
	@Column(name = "email",nullable=true)
    private String emailId;
	
	@Column(name = "contact_name",nullable=true)
    private String contactName;
	
	@Column(name = "vendor_id",nullable=false)
    private String vendorId;
	
	@Column(name = "fax",nullable=true)
	private String fax;
	
	@Column(name = "last_name",nullable=true)
	private String lastName;
	
	@Column(name = "created_by",nullable=false)
    private String createdBy;
	
	@Column(name = "mobile1",nullable=false)
    private String mobile1;
	
	@Column(name = "mobile2",nullable=false)
    private String mobile2;
	
	@Column(name = "email1",nullable=true)
    private String email1;
	
	@Column(name = "contact_name1",nullable=true)
    private String contactName1;
	
	@Column(name = "company_url",nullable=true)
    private String companyUrl;
	
	@Column(name = "image",nullable=true)
    private String image;
	
	@Column(name = "remarks",nullable=true)
    private String remarks;
	
	@Column(name = "confirm_yn",nullable=true) 
    private String confirmYN; 

}
