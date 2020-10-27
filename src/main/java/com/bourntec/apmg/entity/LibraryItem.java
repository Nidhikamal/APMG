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
@Table(name = "library_item")
public class LibraryItem {
	
	@Column(name = "library_id")
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private Integer libraryId;
	
	@Column(name = "item_code")
	private String itemCode;
	
	@Column(name = "short_image")
	private String shortImage;
	
	@Column(name = "actual_image")
	private String actualImage;
}
