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
@Table(name = "inv_unit_charge")
public class InvUnitCharge {
	
	@Id
	@Column(name = "unit_charge",nullable=false)
	private String unitCharge;
	
	@Column(name = "unit_desc",nullable=false)
	private String unitDesc;
}
