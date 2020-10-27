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
@Table(name = "merchandise_category")
public class MerchandiseCategory {
	
    @Id   
    @Column(name = "category_code",unique = true, nullable = false)
    private String categoryCode; 
    
    @Column(name = "category_description", nullable = false)
    private String categoryDescription;
    
    @Column(name = "location_code", nullable = true)
    private String locationCode;
}
