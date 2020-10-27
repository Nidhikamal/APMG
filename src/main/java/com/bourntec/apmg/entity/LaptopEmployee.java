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
 * @author Vidya.p Entity for LaptopEmployee
 */
@Getter
@Setter
@Entity
@Table(name = "laptop_employee")
public class LaptopEmployee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "laptop_show_code", nullable = false)
	private String laptopShowCode;
	

	@Column(name = "emp_id", nullable = false)
	private String empId;
	

	@Column(name = "mode_travel", nullable = true)
	private String modeTravel;
	

	@Column(name = "ticket_no", nullable = true)
	private String ticketNo;
	
	@Column(name = "location_code", nullable = true)
	private String locationCode;
	
	@Column(name = "ship_via", nullable = true)
	private String shipVia;
	
	@Column(name = "track_no", nullable = true)
	private String trackNo;
	
	@Column(name = "destination", nullable = true)
	private String destination;
	
	
	@Column(name = "manifest_id", nullable = true)
	private String manifestId;
	
	
	
	@Column(name = "day_start", nullable = true)
	private Date dayStart;
	
	@Column(name = "day_end", nullable = true)
	private Date dayEnd;
	
	

}
