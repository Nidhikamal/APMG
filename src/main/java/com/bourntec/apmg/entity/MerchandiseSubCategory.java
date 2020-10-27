package com.bourntec.apmg.entity;

/**
 * MerchandiseSubCategory entity.
 * 
 * @author Vidya.p
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "merchandise_sub_category")
public class MerchandiseSubCategory {
	@Id       	
	@Column(name = "sub_category_code",unique = true, nullable = false)
	private String subCategoryCode;
    	
	@Column(name = "category_code", nullable = false)
	private String categoryCode;  
    	
	@Column(name = "sub_category_name", nullable = false)
	private String subCategoryName;		
}
