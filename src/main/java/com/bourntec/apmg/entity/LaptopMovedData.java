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
@Table(name = "laptop_moved_data")
public class LaptopMovedData {
	
    @Id
    @Column(name = "main_lap_id",nullable=false)
    private String mainLapId;
    
    @Column(name = "description",nullable=false)
    private String description;
    
    @Column(name = "lap_date",nullable=true)
    private Date lapDate;
    
    @Column(name = "user_id",nullable=true)
    private String userId;
    
    @Column(name = "emp_id",nullable=true)
    private String empId;
    
    @Column(name = "total_items_moved",nullable=true)
    private Long totalItemsMoved;
    
    @Column(name = "total",nullable=true)
    private Double total;
    
    @Column(name = "location_code",nullable=true)
    private String locationCode;
    
    @Column(name = "lap_code",nullable=true)
    private String lapCode;
    
    @Column(name = "job_loose",nullable=true)
    private String jobLoose;
    
    @Column(name = "showcode",nullable=true)
    private String showcode;
    
    @Column(name = "status",nullable=true)
    private String status;
    
    @Column(name = "update_status",nullable=true)
	private String updateStatus;
    
    @Column(name = "temp_seq_no",nullable=true)
    private Integer tempSeqNo; 
    
    @Column(name = "total_weight_moved",nullable=true)
    private Double totalWeightMoved;
    
}
