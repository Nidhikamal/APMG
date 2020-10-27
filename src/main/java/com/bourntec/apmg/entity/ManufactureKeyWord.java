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
 * @author Athulya
 */
@Getter
@Setter
@Entity
@Table(name = "manufacture_keyword")
public class ManufactureKeyWord {	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",nullable=true)
	private Long id;	
	@Column(name = "key_id",nullable=true)
	private String keyId;	
	@Column(name = "job_no",nullable=true)
	private String jobNo;	 
}