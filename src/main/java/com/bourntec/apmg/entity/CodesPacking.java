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
@Table(name = "codes_packing")
public class CodesPacking {
	
	
    @Id
    @Column(name = "packing_id",nullable=false)    
    private String packingId;
    
    @Column(name = "packing_name",nullable=false)
	private String packingName;
    
    @Column(name = "thumb_image",nullable=true)
	private String thumbImage;
    
    @Column(name = "zoom_image",nullable=true)
	private String zoomImage;
    
    @Column(name = "int_remarks",nullable=true)
	private String intRemarks;
    
    @Column(name = "ext_remarks",nullable=true)
	private String extRemarks;  
}
