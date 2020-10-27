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
@Table(name = "memo_item")
public class MemoItem {
	
    @Id
    @Column(name = "psoj_sl_no",nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long psojSlNo;
    
    @Column(name = "memo_no",nullable=false)
    private String memoNo;
    
    @Column(name = "job_no",nullable=false)
    private String jobNo;
    
    @Column(name = "item_wt",nullable=true)
	private Double itemWt;
    
    @Column(name = "no_pc_p",nullable=false)
	private Long noPcP;
    
    @Column(name = "no_pc_w",nullable=true)
	private Double noPcW;
    
    @Column(name = "unit_price",nullable=true)
	private Double unitPrice;
    
    @Column(name = "gold_price",nullable=true)
	private Double goldPrice;
    
    @Column(name = "karat",nullable=true)
	private Double karat;
    
    @Column(name = "table_karat",nullable=true)
	private String tableKarat;
    
    @Column(name = "my_cost",nullable=true)
	private Double myCost;
    
    @Column(name = "item_cost",nullable=true)
	private Double itemCost;
    
    @Column(name = "mark_up",nullable=true)
	private Double markUp;
    
    @Column(name = "ret_pc_p",nullable=true)
	private Long retPcP;
    
    @Column(name = "ret_pc_w",nullable=true)
	private Double retPcW;
    
    @Column(name = "ret_total_price",nullable=true)
	private Double retTotalPrice;
    
    @Column(name = "ret_misc_chg",nullable=true)
	private Double retMiscChg;
    
    @Column(name = "desc1",nullable=true)
	private String desc1;
    
    @Column(name = "type",nullable=true)
	private String type;
    
    @Column(name = "job_desc",nullable=true)
	private String jobDesc;
    
    @Column(name = "trans",nullable=true)
	private String trans;
    
    @Column(name = "wt_pc",nullable=true)
	private String wtPc;
    
    @Column(name = "location_code",nullable=true)
	private String locationCode;
    
    @Column(name = "tax_yesno",nullable=true)
	private String taxYesno;
    
    @Column(name = "discount_id",nullable=true)
	private String discountId;
    
    @Column(name = "discount_percent",nullable=true)
	private Double discountPercent;
    
    @Column(name = "unit_charge",nullable=true)
	private String unitCharge;
    
    @Column(name = "units_required",nullable=true)
	private Double unitsRequired;
    
    @Column(name = "unit_charge_units",nullable=true)
	private Double unitChargeUnits;
    
    @Column(name = "gl_accountno",nullable=true)
	private String glAccountno;
    
    @Column(name = "ref_number",nullable=true)
	private String refNumber;
    
    @Column(name = "sold_pc_p",nullable=true)
	private Long soldPcP;
    
    @Column(name = "sold_pc_w",nullable=true)
	private Double soldPcW;
    
    @Column(name = "manifest",nullable=true)
	private Long manifest;
    
    @Column(name = "show_code",nullable=true)
	private String showCode;
    
}
