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
@Table(name = "inventory_findings")
public class InventoryFindings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")	
	private Long id;
	
	@Column(name = "item_code",nullable=false)
	private String itemCode;
	
	@Column(name = "finding_id",nullable=false)
	private String findingId;
	
	@Column(name = "pieces",nullable=false)
	private Integer pieces;
	
	@Column(name = "price",nullable=true)
	private Integer price;
	
	@Column(name = "total",nullable=true)
	private Integer total;
	
	@Column(name = "wt_piece",nullable=true)
	private Integer wtPiece;
	
	@Column(name = "karat",nullable=true)
	private Integer karat;
	
	@Column(name = "material",nullable=true)
	private String material;
	
}
