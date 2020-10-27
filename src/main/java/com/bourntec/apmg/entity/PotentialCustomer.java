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
 * Table representaion for potential_customer
 * 
 * @author Priyanka
 *
 */
@Getter
@Setter
@Entity
@Table(name = "potential_customer")
public class PotentialCustomer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "cust_name",nullable=true)
	private String custName;
	
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
	
	@Column(name = "confirm_yn",nullable=true)
    private String confirmYN;
	
	@Column(name = "contact_name",nullable=true)
    private String contactName;
	
	@Column(name = "cust_id",nullable=false)
    private String custId;
	
	@Column(name = "fax",nullable=true)
	private String fax;
	
	@Column(name = "from_yn",nullable=true)
    private String fromYN;
	
	@Column(name = "last_name",nullable=true)
	private String lastName;
	
	@Column(name = "created_by",nullable=false)
    private String createdBy;

	@Column(name = "reject",nullable=true)
    private String reject;

	@Column(name = "group_status",nullable=true)
    private String groupStatus;
     
	@Column(name = "county",nullable=true)
    private String county;
	
	@Column(name = "jbt",nullable=true)
    private String jbt;

	@Column(name = "cbg",nullable=true)
    private String cbg;
	
	@Column(name = "rjo",nullable=true)
    private String rjo;
	
	@Column(name = "ijo",nullable=true)
    private String ijo;
	
	@Column(name = "ags",nullable=true)
    private String ags;
	
	@Column(name = "ja",nullable=true)
    private String ja;
	
	@Column(name = "cust_status",nullable=true) 
    private String custStatus; 

}
