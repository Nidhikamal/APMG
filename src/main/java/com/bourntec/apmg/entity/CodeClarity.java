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
@Table(name = "code_clarity")
public class CodeClarity {
	@Id
	@Column(name = "clarity_id",nullable=false)
	private String clarityId;
	
	@Column(name = "clarityName",nullable=false)
	private String clarityName;

}
