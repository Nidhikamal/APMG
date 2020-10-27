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
 * @author Nince
 */

@Getter
@Setter
@Entity
@Table(name = "inventory_keyword")
public class InventoryKeyword {
	
	@Id
	@Column(name = "id",nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "key_id",nullable=false)
	private String keyId;
	
	@Column(name = "item_code",nullable=false)
	private String itemCode;
}
