package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;




/**
 * VendorContactDetails entity.
 * 
 * @author Vidya.p
 */


@Getter
@Setter
@Entity
@Table(name = "vendor_contact_details")
public class VendorContactDetails {

	@Column(name = "id")
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	
    @Column(name = "vendor_id", nullable = false)
	private String vendorId;

    @Column(name = "phone", nullable = false)
	private String phone;
    
    @Column(name = "fax", nullable = true)
	private String fax;
    
    @Column(name = "cell", nullable = true)
	private String cell;
}