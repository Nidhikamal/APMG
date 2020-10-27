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
 * Table representaion for quote_items
 * @author Athulya Sajeev
 */
@Getter
@Setter
@Entity
@Table(name = "quote_items")
public class QuoteItems {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Long id;	
	@Column(name = "quote_id",nullable=true)
	private Long quoteId;
	@Column(name = "item_code",nullable=true)
	private String itemCode;	
	@Column(name = "description",nullable=true)
	private String description;
	@Column(name = "unit_price",nullable=true)
	private Double unitPrice;	
	@Column(name = "pieces",nullable=true)
	private Integer pieces;
	@Column(name = "weight",nullable=true)
	private Double weight;	
	@Column(name = "tno",nullable=true)
	private String tNo;
	@Column(name = "description1",nullable=true)
	private String description1;
}