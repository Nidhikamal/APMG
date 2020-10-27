package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ad_types")
public class AdTypes {

	@Id
	@Column(name = "id",nullable=false)
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ad_type",nullable=true)
	private String adType;
	
	@Column(name = "ad_type_name",nullable=true)
	private String adTypeName;
}
