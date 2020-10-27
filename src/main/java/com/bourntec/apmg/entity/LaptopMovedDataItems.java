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
@Table(name = "laptop_moved_data_items")
public class LaptopMovedDataItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
   
    @Column(name = "main_lap_id",nullable=false)
    private String mainLapId;
    
    @Column(name = "description",nullable=false)
    private String description;
    
    @Column(name = "item_code",nullable=false)
	private String itemCode;
	
	@Column(name = "no_pc_p",nullable=false)
	private Long noPcP;
	
	@Column(name = "no_pc_w",nullable=true)
	private Double noPcW;
	
	@Column(name = "unit_price",nullable=true)
	private Double unitPrice;
	
	@Column(name = "location_code",nullable=true)
	private String locationCode;
	
	@Column(name = "job_loose",nullable=true)
	private String jobLoose;
	
	@Column(name = "showcode",nullable=false)
	private String showcode;
	
	@Column(name = "notused_wt",nullable=true)
	private Double notusedWt;
	
	@Column(name = "notused_pc",nullable=true)
	private Long notusedPc;
	
	@Column(name = "diffpc",nullable=true)
	private Long diffpc;
	
	@Column(name = "diffwt",nullable=true)
	private Double diffwt;
	
	@Column(name = "mode_received",nullable=true)
	private String modeReceived;
	
	@Column(name = "merged_pieces",nullable=true)
	private Long mergedPieces;
	
	@Column(name = "merged_weight",nullable=true)
	private Double mergedWeight;
	
	@Column(name = "memo_pcs",nullable=true)
	private Long memoPcs; 
	
	@Column(name = "memo_wt",nullable=true)
	private Double memoWt;
	
	@Column(name = "merged_pc",nullable=true)
	private Long mergedPc;
    
}
