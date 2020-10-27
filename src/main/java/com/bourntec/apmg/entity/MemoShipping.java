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
 * Table representaion for Memo Shipping
 * 
 * @author jinto varghese
 *
 */
@Getter
@Setter
@Entity
@Table(name = "memo_shipping")
public class MemoShipping{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "tracking_no")
	private String trackingNo;
	
	@Column(name = "ship_via")
	private String shipVia;
	
	@Column(name = "desc2")
	private String desc2;
	
	@Column(name = "location_code")
	private String locationCode;
	
	@Column(name = "ship_date")
	private Date shipDate;
	
	@Column(name = "memo_no")
	private String memoNo;
	
	@Column(name = "manifest")
	private Long manifest;
	
	@Column(name = "ship_charge")
	private Double shipCharge;
	
	
	//constructors
	
	public MemoShipping() {
		
		
	}
	
	public MemoShipping(String memoNo, Long manifest, String trackingNo, String shipVia, String desc2,
			String locationCode, Date shipDate, Double shipCharge) {
		super();
		this.memoNo = memoNo;
		this.manifest = manifest;
		this.trackingNo = trackingNo;
		this.shipVia = shipVia;
		this.desc2 = desc2;
		this.locationCode = locationCode;
		this.shipDate = shipDate;
		this.shipCharge = shipCharge;
	}
	
	
	
}
