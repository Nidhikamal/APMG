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
@Table(name = "codes_clasp")
public class CodeClasp {

	@Id
	@Column(name = "clasp_id",nullable=false)
	private String claspId;
	
	@Column(name = "clasp_name",nullable=false)
	private String claspName;
	
	@Column(name = "thumb_image",nullable=true)
	private String thumbImage;
	
	@Column(name = "zoom_image",nullable=true)
	private String zoomImage;
}
