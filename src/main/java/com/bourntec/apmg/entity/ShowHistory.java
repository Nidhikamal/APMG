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

/**
 * @author Vidya.p Entity for ShowHistory
 */
@Getter
@Setter
@Entity
@Table(name = "show_history")
public class ShowHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable=false)
    private Long id;
    
    @Column(name = "from_show",nullable=true)
    private String fromShow;
    
    @Column(name = "to_show",nullable=true)
    private String toShow;
    
    @Column(name = "type",nullable=true)
    private String type;
    
    @Column(name = "item_code",nullable=true)
	private String itemCode;
    
    @Column(name = "pieces",nullable=true)
	private Long pieces;
    
    @Column(name = "weight",nullable=true)
	private Double weight;
    
    @Column(name = "date_saved",nullable=true)
	private Date dateSaved;
    
    @Column(name = "customer",nullable=true)
	private String customer;
    
    @Column(name = "user_id",nullable=true)
	private Double userId;
    
  
}
