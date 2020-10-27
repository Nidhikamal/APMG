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
 * @author Athulya
 * Table representaion for manufacture_findings
 */
@Getter
@Setter
@Entity
@Table(name = "manufacture_findings")
public class ManufactureFindings {	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Long id;
	@Column(name = "job_no",nullable=true)
	private String jobNo;	
	@Column(name = "item_code",nullable=true)
	private String itemCode;	
	@Column(name = "pieces",nullable=true)
	private Integer pieces;	
	@Column(name = "price",nullable=true)
	private Double price;	
	@Column(name = "total",nullable=true)
	private Double total;	 
	@Column(name = "karat",nullable=true)
	private Double karat;	
	@Column(name = "wt_piece",nullable=true)
	private Double wtPiece;	
	@Column(name = "material",nullable=true)
	private String material;	  
}