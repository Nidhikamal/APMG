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


@Getter
@Setter
@Entity
@Table(name = "inventory_price_history")
public class InventoryPriceHistory {
	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "item_code",nullable=false)
	private String itemCode;
	
	@Column(name = "old_mark_up",nullable=true)
	private Double oldMarkUp;
	
	@Column(name = "new_mark_up",nullable=true)
	private Double newMarkUp;
	
	@Column(name = "old_sales_price",nullable=true)
	private Double oldSalesPrice;
	
	@Column(name = "new_sales_price",nullable=true)
	private Double newSalesPrice;
	
	@Column(name = "change_date",nullable=false)
	private Date changeDate;
	
	@Column(name = "change_time",nullable=false)
	private Date changeTime;
	
	@Column(name = "user_id",nullable=false)
	private String userId;
	
	@Column(name = "old_labor",nullable=true)
	private Double oldLabor;
	
	@Column(name = "new_labor",nullable=true)
	private Double newLabor;
	
	@Column(name = "old_cost_price",nullable=true)
	private Double oldCostPrice;
	
	@Column(name = "new_cost_price",nullable=true)
	private Double newCostPrice;
}
