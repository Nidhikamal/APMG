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
@Table(name = "codes_color")
public class CodesColor {

	@Id
	@Column(name = "color_id",nullable=false)
	private String colorId;
	
	@Column(name = "color_name",nullable=false)
	private String colorName;
	
	@Column(name = "unit_charge",nullable=false)
	private String unitCharge;

}
