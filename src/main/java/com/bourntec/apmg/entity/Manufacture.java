package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;


/**
 * @author Srijini
 *
 */
@Getter
@Setter
@Entity
@Table(name = "manufacture")
public class Manufacture {
	
	@Id
	@Column(name = " job_no",nullable=true)
	private String	jobNo; 
	
	@Column(name = "item_no",nullable=true)  
	private String  itemNo; 
	
	@Column(name = "item_code",nullable=false)
	private String  itemCode;
	
	@Column(name = "no_pc_out_w",nullable=true)  
	private Double  noPcOutW; 
	
	@Column(name = "no_pc_out_p",nullable=true) 
	private Double  noPcOutP; 
	
	@Column(name = "no_pc_in_w",nullable=true)  
	private Double  noPcInW; 
	
	@Column(name = "no_pc_in_p",nullable=false)  
	private Double  noPcInP;
	
	@Column(name = "cost_pc",nullable=true)  
	private Double  costPc; 
	
	@Column(name = "tot_cost_pc",nullable=true)  
	private Double  totCostPc; 
	
	@Column(name = "desc1",nullable=true)  
	private String  desc1; 
	
	@Column(name = "status",nullable=false)  
	private String  status; 
	
	@Column(name = "item_cost",nullable=true)  
	private Double  itemCost; 
	
	@Column(name = "karat",nullable=true)  
	private Double  karat; 
	
	@Column(name = "gold_price",nullable=true)  
	private Double  goldPrice; 
	
	@Column(name = "item_wt",nullable=true)  
	private Double  itemWt; 
	
	@Column(name = "table_karat",nullable=true)  
	private String  tableKarat; 
	
	@Column(name = "my_cost",nullable=true)  
	private Double  myCost; 
	
	@Column(name = "no_pc_sold_p",nullable=true)  
	private Double  noPcsSoldP; 
	
	@Column(name = "no_pc_sold_w",nullable=true)  
	private Double  noPcsoldW; 
	
	@Column(name = "total_p",nullable=true)  
	private Double  totalP; 
	
	@Column(name = "total_w",nullable=true)  
	private Double  totalW; 
	
	@Column(name = "job_date",nullable=false)  
	private Date  jobDate; 
	
	@Column(name = "type",nullable=true)  
	private String  type; 
	
	@Column(name = "order_p",nullable=true)  
	private Double  orderP; 
	
	@Column(name = "order_w",nullable=true)  
	private Double  orderW; 
	
	@Column(name = "confirm_order_p",nullable=true)  
	private Double  confirmOrderP; 
	
	@Column(name = "confirm_order_w",nullable=true)  
	private Double  confirmOrderW; 
	
	@Column(name = "location_code",nullable=false)  
	private String  locationCode; 
	
	@Column(name = "stock_no",nullable=true)  
	private String  stockNo; 
	
	@Column(name = "tax_yesno",nullable=true)  
	private String  taxYesno; 
	
	@Column(name = "job_modified_date",nullable=true)  
	private Date  jobModifiedDate; 
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "job_modified_time")  
	private Date  jobModifiedTime; 
	
	@Column(name = "cust_no",nullable=true)  
	private String  custNo; 
	
	@Column(name = "priority_code",nullable=true)  
	private String  priorityCode; 
	
	@Column(name = "user_id",nullable=true)  
	private String  userId; 
	
	@Column(name = "user_id_modified",nullable=true)  
	private String  userIdModified; 
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "job_time",nullable=true)  
	private Date  jobTime; 
	
	@Column(name = "basket_no",nullable=true)  
	private String  basketNo; 
	
	@Column(name = "job_finish_date",nullable=true)  
	private Date  jobFinishDate; 
	
	@Column(name = "job_finish_user_id",nullable=true)  
	private String  jobFinishUserId; 
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "job_finish_time",nullable=true)  
	private Date  jobFinishTime; 
	
	@Column(name = "job_type",nullable=true)  
	private String  jobType; 
	
	@Column(name = "small_image",nullable=true)  
	private String  smallImage; 
	
	@Column(name = "color_value",nullable=true)  
	private String  colorValue; 
	
	@Column(name = "size_value",nullable=true)  
	private String  sizeValue;
	
	@Column(name = "order_Double_remarks",nullable=true)  
	private String  orderDoubleRemarks; 
	
	@Column(name = "category_name",nullable=false)  
	private String  categoryName;
	
	@Column(name = "job_completion_date",nullable=true)  
	private Date  jobCompletionDate; 
	
	@Column(name = "ord_sl_no",nullable=true)  
	private String  ordSlNo; 
	
	@Column(name = "material",nullable=true)  
	private String  material; 
	
	@Column(name = "n_material_yn",nullable=true)  
	private String  nMaterialYn; 
	
	@Column(name = "sub_category",nullable=true)  
	private String  subCategory; 
	
	@Column(name = "work_flow_name",nullable=true)  
	private String  workFlowName; 
	
	@Column(name = "material_price",nullable=true)  
	private Double  materialPrice; 
	
	@Column(name = "large_image",nullable=true)  
	private String  largeImage; 
	
	@Column(name = "customize_image",nullable=true)  
	private String  customizeImage; 
	
	@Column(name = "order_style_lib_id",nullable=true)  
	private Double  orderStyleLibId; 
	
	@Column(name = "variant_id",nullable=true)  
	private Double  variantId; 
	
	@Column(name = "desc2",nullable=true)  
	private String  desc2; 
	
	@Column(name = "mark_up",nullable=true)  
	private Double  markUp; 	
	
}
