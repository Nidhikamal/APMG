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
 * Entity class for Items 
 * @author Tinu
 *
 */
@Getter
@Setter
@Entity
@Table(name = "rma_items")
public class RmaItems {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "rma_no")
	private String rmaNo;
	
	@Column(name = "job_no")
	private String jobNo;
	
	@Column(name = "inv_no")
	private String invNo;
	
	@Column(name = "no_pc_p")
	public double noPcP;
	
	@Column(name = "no_pc_w")
	public double noPcW;
	
	@Column(name = "unit_price")
	public double unitPrice;
	
	private String desc1;
	
}
