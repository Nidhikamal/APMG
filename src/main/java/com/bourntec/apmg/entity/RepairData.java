package com.bourntec.apmg.entity;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
/**
 * @author Vidya.p Entity for RepairData
 */

@Getter
@Setter
@Entity
@Table(name = "repair_data")
public class RepairData {
	
    @Id
    @Column(name = "repair_no",nullable=false)
    private String repairNo;
    
    @Column(name = "remarks",nullable=true)
    private String remarks;
    
    @Column(name = "emp_no",nullable=false)
    private String empNo;
    
    @Column(name = "cust_no",nullable=false)
    private String custNo;
    
    @Column(name = "date_taken",nullable=false)
	private Date dateTaken;
    
    @Column(name = "date_repaired",nullable=false)
	private Date dateRepaired;
    
    @Column(name = "sub_total",nullable=true)
	private Double subTotal;
    
    @Column(name = "misc_name",nullable=true)
	private String miscName;
    
    @Column(name = "misc_chg",nullable=true)
	private Double miscChg;
    
    @Column(name = "tax",nullable=true)
	private Double tax;
    
    @Column(name = "status",nullable=true)
	private String status;
    
    @Column(name = "track_no",nullable=true)
	private String trackNo;	
    
    @Column(name = "ship_via",nullable=true)
	private String shipVia;
    
    @Column(name = "location_code",nullable=true)
	private String locationCode;
    
    @Column(name = "cust_name",nullable=true)
	private String custName;
    
    @Column(name = "phone_no",nullable=true)
	private String phoneNo;
    
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
    
    @Column(name = "email_address",nullable=true)
	private String emailAddress;
    
    @Column(name = "attachment",nullable=true)
	private String attachment;
    
    @Column(name = "type",nullable=true)
	private String type;
    
    @Column(name = "created_by",nullable=false)
	private String createdBy;
    
    @Column(name = "parcel_no",nullable=true)
	private String parcelNo;
    
    @Column(name = "clients_email",nullable=true)
	private String clientsEmail;
    
    @Column(name = "clients_name",nullable=true)
	private String clientsName;
}
