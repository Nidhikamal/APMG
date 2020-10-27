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
@Table(name = "inventory_item_breaking")
public class InventoryItemBreaking {
    @Id
    @Column(name = "id",nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "item_breaking_id",nullable=false)
    private Long itemBreakingId;
    
    @Column(name = "item_code",nullable=false)
    private String itemCode;
    
    @Column(name = "item_gain",nullable=false)
	private Double itemGain;
    
    @Column(name = "item_price",nullable=false)
	private Double itemPrice;
    
    @Column(name = "item_total",nullable=false)
	private Double itemTotal;
    
    @Column(name = "item_weight",nullable=false)
	private Double itemWeight;
    
    @Column(name = "karat",nullable=false)
	private Double karat;
    
    @Column(name = "pieces_breaking",nullable=false)
	private Integer piecesBreaking;
    
    @Column(name = "reason",nullable=false)
	private String reason;
    
    @Column(name = "total_value",nullable=false)
	private Double totalValue;
    
    @Column(name = "stock",nullable=false)
	private Integer stock;
    
    @Column(name = "item_karat",nullable=false)
	private Double itemKarat;    
}
