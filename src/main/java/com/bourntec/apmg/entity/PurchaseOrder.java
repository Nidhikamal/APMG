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
 * Table representaion for purchase_order
 * 
 * @author Priyanka
 *
 */
@Getter
@Setter
@Entity
@Table(name = "purchase_order")
public class PurchaseOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long purchaseNo;

	@Column(name = "description",nullable=true)
	private String description;
	
	@Column(name = "vendor_no",nullable=true)
    private String vendorNo;
	
	@Column(name = "purchase_date",nullable=true)
    private Date purchaseDate;
	
	@Column(name = "order_by",nullable=true)
    private String orderBy;

	@Column(name = "mischg_name",nullable=true)
    private String mischgName;
	
	@Column(name = "misc_chg",nullable=true)
    private Double miscChg;
	
	@Column(name = "total",nullable=true)
    private Double total;
	
	@Column(name = "status",nullable=true)
    private String status;
	
	@Column(name = "stock_type",nullable=true)
    private String stockType;
	
	@Column(name = "location_code",nullable=true)
    private String locationCode;
	
	@Column(name = "desc_internal",nullable=true)
    private String descInternal;
	
	@Column(name = "date_required",nullable=true)
    private Date dateRequired;
	
	@Column(name = "mail_yn",nullable=true)
    private String mailYn;
	
}
