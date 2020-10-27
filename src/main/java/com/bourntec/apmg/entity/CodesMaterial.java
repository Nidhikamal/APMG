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
@Table(name = "codes_material")
public class CodesMaterial {
	
	@Id
	@Column(name = "material_id",nullable=false)
	private String materialId;
	
	@Column(name = "material_name",nullable=false)
	private String materialName;	
}
