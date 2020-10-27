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
 * Table representaion for job_product_keywords
 * 
 * @author Babu
 *
 */
@Getter
@Setter
@Entity
@Table(name = "job_product_keywords")
public class JobProductKeywords {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "job_no",nullable=false)
	private String jobNo;

	@Column(name = "keyword_desc",nullable=true)
	private String keywordDesc;

}
