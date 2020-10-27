/**
 * 
 */
package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Nince
 *
 */

@Getter
@Setter
@Entity
@Table(name = "point_sale_address")
public class PointSaleAddress {
	
	@Id
	@Column(name = "inv_no", nullable = false)
	private String invNo;
	
	@Column(name = "address1", nullable = true)
	private String address1;
	
	@Column(name = "address2", nullable = true)
	private String address;
	
	@Column(name = "city", nullable = true)
	private String city;
	
	@Column(name = "state", nullable = true)
	private String state;
	
	@Column(name = "zip", nullable = true)
	private Long zip;
	
	@Column(name = "country", nullable = true)
	private String country;
	
	@Column(name = "ship_name", nullable = true)
	private String shipName;
	
	@Column(name = "zips", nullable = true)
	private String zips;
	
	@Column(name = "location_code", nullable = true)
	private String locationCode;
	
	@Column(name = "phone1", nullable = true)
	private String phone1;
	
	@Column(name = "address_name", nullable = true)
	private String addressName;
	
	@Column(name = "client_address", nullable = true)
	private String clientAddress;
	
}
