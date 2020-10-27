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
@Table(name = "company_data")
public class CompanyData {
	
	
    @Id
    @Column(name = "company_code",nullable=false)    
    private String companyCode;
    
    @Column(name = "company_name",nullable=false)
    private String companyName;
    
    @Column(name = "address1",nullable=true)
    private String address1;
    
    @Column(name = "address2",nullable=true)
    private String address2;
    
    @Column(name = "desc1",nullable=true)
    private String desc1;
    
    @Column(name = "web_address",nullable=true)
    private String webAddress;
    
    @Column(name = "phone",nullable=true)
    private String phone;
    
    @Column(name = "fax",nullable=true)
    private String fax;
    
    @Column(name = "email_address",nullable=true)
    private String emailAddress;
    
    @Column(name = "company_font",nullable=true)
    private String companyFont;
    
    @Column(name = "company_size",nullable=true)
    private String companySize;
}
