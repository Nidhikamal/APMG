package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "type_data")
public class TypeData {
	
	@Id
	@Column(name = "type_code", nullable = false)
	private String typeCode;
	
	@Column(name = "type_name", nullable = false)
	private String typeName;
	
	@Column(name = "location_code", nullable = true)
	private String locationCode;
	
	@Column(name = "unit_charge", nullable = false)
	private String unitCharge;
	
	@Column(name = "display_web", nullable = true)
	private String displayWeb;
	
	@Column(name = "type_image", nullable = true)
	private String typeImage;	
	
	@Column(name="category", nullable = false)
	private String category;
}
