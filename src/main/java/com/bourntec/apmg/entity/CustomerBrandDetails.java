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
 * CustomerBrandDetails entity.
 * @author Vidya.p
 */

@Getter
@Setter
@Entity
@Table(name = "customer_brand_details")
public class CustomerBrandDetails {

	@Column(name = "id",nullable=false)
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	
	@Column(name = "status",nullable=false)
	private String status;
	
	@Column(name = "brand_id",nullable=false)
	private Long brandId;
	
	@Column(name = "cust_no",nullable=false)
	private String custNo;
	
	@Column(name = "terms_days",nullable=true)
	private Long termsDays;
	
	@Column(name = "mark_up",nullable=true)
	private Double markUp;
	
	@Column(name = "discount",nullable=true)
	private Double discount;
	
	@Column(name = "sales_person",nullable=true)
	private String salesPerson;
	
	@Column(name = "previous_salesman",nullable=true)
	private String previousSalesMan;
	
	@Column(name = "sales_person_2",nullable=true)
	private String salesPerson2;
	
	@Column(name = "sales_person_3",nullable=true)
	private String salesPerson3;
	
	@Column(name = "memo_mark_up",nullable=true)
	private Double memoMarkUp;
}