package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
VendorNotification entity * 
 * @author Vidya.p
 */

@Getter
@Setter
@Entity
@Table(name = "vendor_notification")
public class VendorNotification  {
	
	@Id   
	@Column(name = "vendor_no",unique = true, nullable = false)
	private String vendorNo;
	
	@Column(name = "desc1", nullable = true)
	private String desc1;
	
	@Column(name = "desc2", nullable = true)
	private String desc2;
	
	@Column(name = "order1", nullable = true)
	private String order1;
	
	@Column(name = "order2", nullable = true)
	private String order2;
	
	@Column(name = "invoice1", nullable = true)
    private String invoice1;
	
	@Column(name = "invoice2", nullable = true)
	private String invoice2;
	
	@Column(name = "return1", nullable = true)
	private String return1;
	
	@Column(name = "return2", nullable = true)
	private String return2;
	
	@Column(name = "repair1", nullable = true)
	private String repair1;
	
	@Column(name = "repair2", nullable = true)
	private String repair2;
}