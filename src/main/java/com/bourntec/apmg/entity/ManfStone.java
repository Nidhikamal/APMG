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
 * @author Srijini
 *
 */
@Getter
@Setter
@Entity
@Table(name = "manf_stone")
public class ManfStone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	@Column(name = "job_no",nullable=false)
	private String jobNo;
	@Column(name = "item_no",nullable=true)
	private Double itemNo;
	@Column(name = "item_code",nullable=false)
	private String itemCode;
	@Column(name = "no_stone_in_w",nullable=true)
	private Double noStoneInW;
	@Column(name = "no_stone_in_p",nullable=true)
	private Double noStoneInP;
	@Column(name = "no_stone_out_w",nullable=true)
	private Double noStoneOutW;
	@Column(name = "no_stone_out_p",nullable=true)
	private Double noStoneOutP;
	@Column(name = "karat",nullable=true)
	private Double karat;
	@Column(name = "cost_stone",nullable=true)
	private Double costStone;
	@Column(name = "desc1",nullable=true)
	private String desc1;
	@Column(name = "location_code",nullable=true)
	private String locationCode;
	@Column(name = "unit_charge",nullable=true)
	private String unitCharge;
	@Column(name = "clarity",nullable=true)
	private String clarity;
	@Column(name = "color",nullable=true)
	private String color;
	@Column(name = "setting",nullable=true)
	private String setting;
	@Column(name = "shape",nullable=true)
	private String shape;
}