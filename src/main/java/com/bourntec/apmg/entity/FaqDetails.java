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
/**
 * FaqDetails entity.
 * 
 * @author Vidya.p
 */

@Getter
@Setter
@Entity
@Table(name = "faq_details")
public class FaqDetails {


	@Column(name = "id",nullable=false)
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private Integer id;
	
	@Column(name = "module",nullable=false)
	private String module;
	
	@Column(name = "question",nullable=false)
	private String question;
	
	@Column(name = "answer",nullable=true)
	private String answer;
	
	@Column(name = "status",nullable=true)
	private String status;
	
	@Column(name = "created_user",nullable=true)
	private String createdUser;
	
	@Column(name = "created_date",nullable=true)
	private Date createdDate;
	
	@Column(name = "last_modified_user",nullable=true)
	private String lastModifiedUser;
	
	@Column(name = "last_modified_date",nullable=true)
	private Date lastModifiedDate;
}


