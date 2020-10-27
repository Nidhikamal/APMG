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
@Table(name = "item_breaking")
public class ItemBreaking {
    @Id
    @Column(name = "id",nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "total_pieces_breaking",nullable=false)
    private int totalPiecesBreaking;
    
    @Column(name = "karat",nullable=false)
    private Double karat;
    
    @Column(name = "breaking_date",nullable=false)
    private Date breakingDate;
    
    @Column(name = "total_value",nullable=false)
	private Double totalValue;
    
    @Column(name = "total_gain",nullable=false)
	private Double totalGain;
    
    @Column(name = "remarks",nullable=false)
	private String remarks;
    
    @Column(name = "status",nullable=false)
	private String status;
    
    @Column(name = "vendor_no",nullable=false)
	private String vendorNo;
    
}
