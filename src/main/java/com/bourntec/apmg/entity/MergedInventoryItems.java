package com.bourntec.apmg.entity;

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
@Table(name = "merged_inventory_items")
public class MergedInventoryItems {
	
	    @Id
	    @Column(name = "id",nullable=false)
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	   
	    @Column(name = "item_code",nullable=false)
	    private String itemCode;
	    
	    @Column(name = "job_no",nullable=false)
	    private String jobNo;
}
