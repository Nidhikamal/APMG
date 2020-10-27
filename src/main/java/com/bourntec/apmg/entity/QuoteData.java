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
 * @author Athulya Sajeev
 * Table representaion for QuoteData
 */
@Getter
@Setter
@Entity
@Table(name = "quote_data")
public class QuoteData {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="quote_id")
	private Long quoteId;	
	@Column(name = "customer",nullable=true)
	private String customer;
	@Column(name = "created_date",nullable=true)
	private Date createdDate;	
	@Column(name = "created_by",nullable=true)
	private String createdBy;
	@Column(name = "total",nullable=true)
	private Double total;	
	@Column(name = "contact_person",nullable=true)
	private String contactPerson;
	@Column(name = "email",nullable=true)
	private String email;	
	@Column(name = "contact_no",nullable=true)
	private String contactNo;
	@Column(name = "status",nullable=true)
	private String status;	 
}