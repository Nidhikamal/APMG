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
 * Table representaion for email_tokens
 */
@Getter
@Setter
@Entity
@Table(name = "email_tokens")
public class EmailTokens {	
	@Id
    @Column(name = "id",nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "token_id",nullable=true)  
	private String tokenId;
	@Column(name = "mail_date",nullable=true)  
	private Date mailDate;
	@Column(name = "status",nullable=true)  
	private String status;
	@Column(name = "mail_id",nullable=true)  
	private String mailID;
}