package com.bourntec.apmg.entity;
 
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
 * Table representaion for email_template
 */
@Getter
@Setter
@Entity
@Table(name = "email_template")
public class EmailTemplate {	
	@Id
    @Column(name = "id",nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "temp_name",nullable=true) 
	private String templateName;
	@Column(name = "module",nullable=true) 
	private String module;
	@Column(name = "subject",nullable=true) 
	private String subject;
	@Column(name = "message_value",nullable=true) 
	private String messageValue;
	@Column(name = "type",nullable=true) 
	private String type;
	@Column(name = "default_from_mail_id",nullable=true) 
	private String defaultFromMailId;
}