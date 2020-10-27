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
 * Table representaion for proforma_item_details
 * @author Athulya Sajeev
 */
@Getter
@Setter
@Entity
@Table(name = "proforma_item_details")
public class ProformaItemDetails {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id",nullable=true)
	private Long id;	
	@Column(name = "proforma_no",nullable=true)
	private String proformaNo;
	@Column(name = "item",nullable=true)
	private String item;
	@Column(name = "description",nullable=true)
	private String description;
	@Column(name = "item_discount",nullable=true)
	private Double itemdiscount;	
	@Column(name = "item_total",nullable=true)
	private Double itemtotal;
	@Column(name = "nopcp",nullable=true)
	private Integer nopcp;	
	@Column(name = "nopcw",nullable=true)
	private Double nopcw;
	@Column(name = "unitprice",nullable=true)
	private Double unitprice;
	@Column(name = "orderp",nullable=true)
	private Integer orderp;	
	@Column(name = "invoicep",nullable=true)
	private Integer invoicep;
}