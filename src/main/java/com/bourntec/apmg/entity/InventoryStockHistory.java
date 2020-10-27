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
 * @author Vidya
 */


@Entity
@Table(name = "inventory_stock_history")
@Setter
@Getter
public class InventoryStockHistory {
	
	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "item_code",nullable=false)
	private String itemCode;
	
	@Column(name = "old_pieces",nullable=true)
	private Integer oldPieces;
	
	@Column(name = "new_pieces",nullable=true)
	private Integer newPieces;
	
	@Column(name = "change_date",nullable=false)
	private Date changeDate;
	
	@Column(name = "change_time",nullable=false)
	private Date changeTime;
	
	@Column(name = "user_id",nullable=false)
	private String userId;
	
	@Column(name = "old_weight",nullable=true)
	private Double oldWeight;
	
	@Column(name = "new_weight",nullable=true)
	private Double newWeight;
	
	@Column(name = "unit_charge",nullable=false)
	private String unitCharge;
}