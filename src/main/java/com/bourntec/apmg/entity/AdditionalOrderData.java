/**
 * 
 */
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
 * @author naveen
 *
 */

@Getter
@Setter
@Entity
@Table(name = "additional_order_data")
public class AdditionalOrderData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "additional_data_value",nullable=false)
	private String additionalDataValue;
	
	@Column(name = "additional_data_name",nullable=false)
	private String additionalDataName;
	
	@Column(name = "additional_data_desc",nullable=true)
	private String additionalDataDesc;
	
	@Column(name = "sl_no",nullable=true)
	private String slNo;
}
