package com.bourntec.apmg.entity;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
/**
 * @author Athulya Sajeev
 * Table representaion for dpm_stones
 */
@Getter
@Setter
@Entity
@Table(name = "dpm_stones")
public class DPMStones {	
	@Id
    @Column(name = "id",nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "dpm_id",nullable=true) 
	private Long dpm_id;
	@Column(name = "carat",nullable=true) 
	private Double carat;
	@Column(name = "mm",nullable=true) 
	private Double mm;
	@Column(name = "plate_size",nullable=true) 
	private Short plateSize;
	@Column(name = "pointers",nullable=true) 
	private Double pointers;
	@Column(name = "pieces",nullable=true) 
	private Integer pieces;
	@Column(name = "amount",nullable=true) 
	private Double amount;
	@Column(name = "notes",nullable=true) 
	private String notes;
	@Column(name = "mm_size",nullable=true) 
	private String mmSize;
}