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
 * Table representaion for payables_return_items
 * 
 * @author Priyanka
 *
 */
@Getter
@Setter
@Entity
@Table(name = "payables_return_items")
public class PayablesReturnItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "return_no",nullable=false)
    private Long returnNo;
	
	@Column(name = "item_code",nullable=false)
    private String itemCode;
	
	@Column(name = "vendor_item_code",nullable=true)
    private String vendorItemCode;
	
	@Column(name = "merch_no",nullable=true)
    private String merchNo;
	
	@Column(name = "no_pc_p",nullable=false)
    private Short noPcP;
	
	@Column(name = "no_pc_w",nullable=true)
    private Double noPcW;

	@Column(name = "unit_price",nullable=true)
    private Double unitPrice;
	
   	@Column(name = "item_description",nullable=true)
    private String itemDescription;
   	   
}
