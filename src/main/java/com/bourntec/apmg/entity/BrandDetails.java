package com.bourntec.apmg.entity;


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
@Table(name = "brand_details")
public class BrandDetails {
    @Id
    @Column(name = "brand_id",nullable=false)
                   
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long brandId;
    
    @Column(name = "brand_name",nullable=false)
    private String brandName;
    
    @Column(name = "brand_status",nullable=true)
    private String brandStatus;
    
    @Column(name = "brand_desc",nullable=true)
    private String brandDesc;
}
