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
 * Table representaion for export_parcel
 */
@Getter
@Setter
@Entity
@Table(name = "export_parcel")
public class ExportParcel {	
	@Id
    @Column(name = "id",nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "description",nullable=true)   	
	private String description;
	@Column(name = "export_no",nullable=true)   	
	private Long exportNo;
	@Column(name = "weight",nullable=true)   	
	private Double weight;
	@Column(name = "total",nullable=true)   	
	private Double total;
	@Column(name = "parcel_no",nullable=true)   	
	private Long parcelNo;
	@Column(name = "price",nullable=true)   	
	private Double price;
}