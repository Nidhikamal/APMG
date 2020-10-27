package com.bourntec.apmg.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * ParcelDetails entity. 
 * @author vidya
 */

@Getter
@Setter
@Entity
@Table(name = "parcel_details")
public class ParcelDetails {
	
	@Id 
	@Column(name = "parcel_no", nullable = false)
	private String parcelNo;
	
	@Column(name = "cust_vend_type", nullable = true)
	private String custVendType;
	
	@Column(name = "cust_vend_id", nullable = true)
	private String custVendId;
	
	@Column(name = "created_by", nullable = false)
	private String createdBy;
	
	@Column(name = "created_date", nullable = false)
	private Date createdDate;
	
	@Column(name = "courier_agency", nullable = true)
	private String courierAgency;
	
	@Column(name = "parcel_name", nullable = true)
	private String parcelName;
	
	@Column(name = "parcel_street", nullable = true)
	private String parcelStreet;
	
	@Column(name = "parcel_city", nullable = true)
	private String parcelCity;
	
	@Column(name = "parcel_state", nullable = true)
	private String parcelState;
	
	@Column(name = "parcel_country", nullable = true)
	private String parcelCountry;
	
	@Column(name = "parcel_wt", nullable = true)
	private Double parcelWt;
	
	@Column(name = "parcel_desc", nullable = true)
	private String parcelDesc;
	
	@Column(name = "accepted_by", nullable = true)
	private String acceptedBy;
	
	@Column(name = "zip", nullable = true)
	private String zip;
	
	@Column(name = "parcel_street2", nullable = true)
	private String parcelStreet2;
	
	@Column(name = "tracking_no", nullable = true)
	private String trackingNo;
	
	@Column(name = "email", nullable = true)
	private String email;	
	
	@Column(name = "received_date", nullable = true)
	private Date receivedDate;
	
	@Column(name = "no_boxes", nullable = true)
	private long noBoxes;
	
	@Column(name = "location_receiving", nullable = true)
	private String locationReceiving;
}
