package com.bourntec.apmg.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "laptop_show_details")
public class LaptopShowDetails {
	
    @Id
    @Column(name = "laptop_show_code",nullable=false)
    private String  laptopShowCode;
    
    @Column(name = "userid",nullable=false)
    private String userId;
    
    @Column(name = "status",nullable=true)
    private String status;
    
    @Column(name = "show_description",nullable=true)
    private String showDescription;
    
    @Column(name = "sales_person",nullable=true)
    private String salesPerson;
    
    @Column(name = "org_last_invno",nullable=true)
    private Integer orgLastInvNo;
    
    @Column(name = "location_code",nullable=true)
    private String locationCode;
    
    @Column(name = "last_invno",nullable=true)
    private Integer lastInvNo;
    
    @Column(name = "first_invno",nullable=true)
    private Integer firstInvNo;
    
    @Column(name = "date_of_show",nullable=true)
    private Date dateOfShow;
    
    @Column(name = "date_entered",nullable=true)
    private Date dateEntered;
}
