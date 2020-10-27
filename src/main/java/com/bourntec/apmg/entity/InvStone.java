package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "inv_stone")
public class InvStone {
	
	@Id
	@Column(name = "item_code",nullable=false)
	private String itemCode;

	@Column(name = "stone_shape",nullable=true)
	private String stoneShape;

	@Column(name = "stone_clarity",nullable=true)
	private String stoneClarity;

	@Column(name = "avg_stone_wt",nullable=true)
	private Double avgStoneWt;

	@Column(name = "prop",nullable=true)
	private String prop;

	@Column(name = "certificate",nullable=true)
	private String certificate;

	@Column(name = "dim_h",nullable=true)
	private Double dimH;

	@Column(name = "dim_b",nullable=true)
	private Double dimB;

	@Column(name = "dim_l",nullable=true)
	private Double dimL;
	
	@Column(name = "location_code",nullable=true)
	private String locationCode;
	
	@Column(name = "stone_color",nullable=true)
	private String stoneColor;
}
