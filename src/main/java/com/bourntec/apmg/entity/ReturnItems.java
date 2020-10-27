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
@Table(name = "return_items")
public class ReturnItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
  
	@Column(name = "return_no",nullable=false)
    private String returnNo;
	
    @Column(name = "job_no",nullable=false)
	private String jobNo;
    
    @Column(name = "inv_no",nullable=false)
	private String invNo;
    
    @Column(name = "no_pc_p",nullable=false)
	private Double noPcP;
    
    @Column(name = "no_pc_w",nullable=true)
	private Double noPcW;
    
    @Column(name = "unit_price",nullable=true)
	private Double unitPrice;
	
    @Column(name = "\"desc\"",nullable=true) 
	private String desc;
	 
    @Column(name = "misc_chg",nullable=true)
	private Double miscChg;
    
    @Column(name = "desc1",nullable=true)
	private String desc1;
    
    @Column(name = "location_code",nullable=true)
	private String locationCode;
    
    @Column(name = "discount",nullable=true)
	private Double discount;
    
    @Column(name = "tax_per",nullable=true)
	private Double taxPer;
    
    @Column(name = "item_discount",nullable=true)
	private Double itemDiscount;
    
    @Column(name = "original_unitprice",nullable=true)
    private Double originalUnitprice;
    
    @Column(name = "from_show",nullable=true)
    private String fromShow;
    
    @Column(name = "memo_no",nullable=true)
    private String memoNo;
    
    @Column(name = "to_show")
    private String toShow;
}
