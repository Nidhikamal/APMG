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
 * Table representaion for potential_vendor_attachment
 * 
 * @author Priyanka
 *
 */
@Getter
@Setter
@Entity
@Table(name = "potential_vendor_attachment")
public class PotentialVendorAttachment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "pot_vendor_id",nullable=false)
    private Long potVendorId;
	
	@Column(name = "file_name",nullable=false)
    private String fileName;
	
}
