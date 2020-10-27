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
 * Table representaion for potential_customer_brands
 * 
 * @author Priyanka
 *
 */
@Getter
@Setter
@Entity
@Table(name = "potential_customer_brands")
public class PotentialCustomerBrands {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "brand_id",nullable=false)
	private Integer brandId;

	@Column(name = "status",nullable=true)
	private String status;
	
	@Column(name = "potential_cust_no",nullable=false)
	private Long potentialCustNo;
}

