package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Babu
 *
 */
@Getter
@Setter
@Entity
@Table(name = "inventory_summary")
public class InventorySummary {
	@Id
	@Column(name = "item_code",nullable=false)
	private String itemCode;
	
	@Column(name = "pictures",nullable=true)
	private String pictures;
	
	@Column(name = "silver",nullable=true)
	private String silver;
	
	@Column(name = "master",nullable=true)
	private String master;
	
	@Column(name = "stone_breakdown",nullable=true)
	private String stoneBreakdown;
	
	@Column(name = "design",nullable=true)
	private String design;
	
}
