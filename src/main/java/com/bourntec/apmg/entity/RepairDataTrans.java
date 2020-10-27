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

@Getter
@Setter
@Entity
@Table(name = "repair_data_trans")
public class RepairDataTrans {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "repair_no",nullable=false)
    private String repairNo;
	
    @Column(name = "repair_sno",nullable=false)
	private Integer repairSno;
    
    @Column(name = "remarks",nullable=true)
	private String remarks;
    
    @Column(name = "no_pc_in",nullable=true)
	private Integer noPcIn;
    
    @Column(name = "no_wt_in",nullable=true)
	private Double noWtIn;
    
    @Column(name = "no_pc_out",nullable=true)
	private Double noPcOut;
    
    @Column(name = "no_wt_out",nullable=true)
	private Double noWtOut;
    
    @Column(name = "total_price",nullable=true)
	private Double totalPrice;
    
    @Column(name = "location_code",nullable=true)
	private String locationCode;
    
    @Column(name = "category",nullable=true)
	private String category;
    
    @Column(name = "image",nullable=true)
	private String image;
    
    @Column(name = "job_no",nullable=false)
	private String jobNo;
    
    @Column(name = "original_image",nullable=true)
	private String originalImage;
    
    @Column(name = "promised_date",nullable=true)
	private Date promisedDate;
    
    @Column(name = "created_by",nullable=false)
	private String createdBy;
    
    @Column(name = "fault_from",nullable=true)
	private String faultFrom;
    
    @Column(name = "fault_reason",nullable=true)
	private String faultReason;
    
}
