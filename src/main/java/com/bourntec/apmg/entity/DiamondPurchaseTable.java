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
 * @author Athulya Sajeev
 * Table representaion for diamond_purchase_table
 */
@Getter
@Setter
@Entity
@Table(name = "diamond_purchase_table")
public class DiamondPurchaseTable {	
	@Id
    @Column(name = "id",nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "purchase_date",nullable=true)
	private Date purchaseDate;
	@Column(name = "party_name",nullable=true)
	private String partyName;
	@Column(name = "original_carats",nullable=true)
	private Double originalCarats;
	@Column(name = "out_perc",nullable=true)
	private Double outPerc;
	@Column(name = "selection",nullable=true)
	private Double selection;
	@Column(name = "rate",nullable=true)
	private Double rate;
	@Column(name = "amount",nullable=true)
	private Double amount;
	@Column(name = "terms",nullable=true)
	private String terms;
	@Column(name = "broker",nullable=true)
	private String broker;
	@Column(name = "export_code",nullable=true)
	private String exportCode;
	@Column(name = "purchase_description",nullable=true)
	private String purchaseDescription;
	@Column(name = "rejection_date",nullable=true)
	private Date rejectionDate;
	@Column(name = "emp_no",nullable=true)
	private String empNo;
	@Column(name = "created_date",nullable=true)
	private Date createdDate;
	@Column(name = "memo",nullable=true)
	private String memo;
	@Column(name = "broker_yn",nullable=true)
	private String brokerYN;
	@Column(name = "rejection_mode",nullable=true)
	private String rejectionMode;
	@Column(name = "rejection_qty",nullable=true)
	private Double rejQty;
	@Column(name = "rejection_pieces",nullable=true)
	private Double rejPieces; 
	@Column(name = "rate1",nullable=true)
	private Double rate1;
	@Column(name = "rate2",nullable=true)
	private Double rate2;
	@Column(name = "currency",nullable=true)
	private String currency;
	@Column(name = "currency_exg_rate",nullable=true)
	private Double currencyExgRate;
	@Column(name = "code",nullable=true)
	private String code;
	@Column(name = "mail_sent_yn",nullable=true)
	private String mailSentYN;
	@Column(name = "location",nullable=true)
	private String location;	
	@Column(name = "stone_moved_yn",nullable=true)
	private String stoneMovedYN;
	@Column(name = "stone_type",nullable=true)
	private String stoneType;
	@Column(name = "inventory_item_code",nullable=true)
	private String invItemcode;
	@Column(name = "inventory_item_category",nullable=true)
	private String itemCategory;
	@Column(name = "inventory_item_clarity",nullable=true)
	private String itemClarity;
	@Column(name = "inventory_item_color",nullable=true)
	private String itemColor;
	@Column(name = "amount_currency",nullable=true)
	private String amountCurrency;  
}