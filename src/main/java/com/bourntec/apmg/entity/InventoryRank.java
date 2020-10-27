package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "inventory_rank")
public class InventoryRank {
	
	@Id
	@Column(name = "rank",nullable=false)
	private String rank;
	
	@Column(name = "desc1",nullable=false)
	private String desc1; 
	
	@Column(name = "location_code",nullable=true)
	private String locationCode;
}
