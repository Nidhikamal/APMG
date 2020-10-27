package com.bourntec.apmg.entity;

import java.util.Date;

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
@Table(name = "ad_details")
public class AdDetails {

	@Id
	@Column(name = "id",nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "ad_type",nullable=true)
	private String adType;
	
	@Column(name = "ad_name",nullable=true)
	private String adName;

	@Column(name = "ad_desc",nullable=true)
	private String adDesc;

	@Column(name = "ad_keywords",nullable=true)
	private String adKeywords;
	
	@Column(name = "ad_country",nullable=true)
	private String adCountry;

	@Column(name = "ad_state",nullable=true)
	private String adState;

	@Column(name = "ad_published_date",nullable=true)
	private Date adPublishedDate;

	@Column(name = "ad_created_date",nullable=true)
	private Date adCreatedDate;

	@Column(name = "ad_created_by",nullable=true)
	private String adCreatedBy;
	
	@Column(name = "ad_status",nullable=true)
	private String adStatus;
}
