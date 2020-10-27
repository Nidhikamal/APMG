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
 * @author Babu
 */


@Getter
@Setter
@Entity
@Table(name = "product_keywords")
public class ProductKeywords {
	
	@Column(name = "key_uid", nullable = false)
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private Integer keyUid;
	
	@Column(name = "keyword_id", nullable = true)
	private String keywordId;
	
	@Column(name = "item_code", nullable = false)
	private String itemCode;
	
	@Column(name = "keyword_desc", nullable = true)
	private String keywordDesc;	
}
