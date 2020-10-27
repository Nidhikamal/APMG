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
 * Table representaion for Laptop  Attachment
 * 
 * @author AMAL
 *
 */
@Getter
@Setter
@Entity
@Table(name = "laptop_attachment")
public class LaptopAttachment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",nullable=false)
	private Long id;
	
	@Column(name = "attachment",nullable=false)
	private String attachment;

	@Column(name = "laptop_show_code",nullable=false)
	private String laptopShowCode;

	



}
