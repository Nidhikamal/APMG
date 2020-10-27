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
 * Table representaion for inv_weight
 * 
 * @author Vidya
 *
 */
@Getter
@Setter
@Entity
@Table(name = "inv_weight")
public class InvWeight {
	
	@Id
	@Column(name = "item_code",nullable=false)
	private String itemCode;
	
	@Column(name = "wax_type",nullable=true)
	private String waxType;
	
	@Column(name = "injecting_time",nullable=true)
	private String injectingTime;
	
	@Column(name = "vaccum",nullable=true)
	private String vaccum;
	
	@Column(name = "pressure",nullable=true)
	private String pressure;
	
	@Column(name = "tumbling_time",nullable=true)
	private String tumblingTime;
	
	@Column(name = "wt_in_10k",nullable=true)
	private Double wtIn10k;
	
	@Column(name = "wt_in_14k",nullable=true)
	private Double wtIn14k;
	
	@Column(name = "wt_in_18k",nullable=true)
	private Double wtIn18k;
	
	@Column(name = "wt_in_pt",nullable=true)
	private Double wtInPt;
	
	@Column(name = "config",nullable=true)
	private String config;
	
	@Column(name = "locking",nullable=true)
	private String locking;

	
}
