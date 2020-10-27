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
 * @author Babu
 */

@Getter
@Setter
@Entity
@Table(name = "inventory_alternate")
public class InventoryAlternate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "item_code",nullable=false)
	private String itemCode;
	
	@Column(name = "item_code_alt",nullable=false)
	private String itemCodeAlt;
	
	@Column(name = "desc1",nullable=true)
	private String desc1;
	
	@Column(name = "priority_code",nullable=true)
	private String priorityCode;
	
	@Column(name = "location_code",nullable=true)
	private String locationCode;
}
