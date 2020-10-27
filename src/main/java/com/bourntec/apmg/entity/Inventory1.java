package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Amal
 */

@Getter
@Setter
@Entity
@Table(name = "inventory1")
public class Inventory1 {
	
	@Id
	@Column(name = "item_code",nullable=false)
	private String itemCode;
	
	@Column(name = "description1",nullable=true)
	private String description1;
	
	@Column(name = "in_stock_w",nullable=true)
	private Double inStockW;
	
	@Column(name = "in_stock_p",nullable=false)
	private Integer inStockP;
	
	@Column(name = "unit_charge",nullable=false)
	private String unitCharge;
	
	@Column(name = "cost_pc",nullable=true)
	private Double costPc;
	
	@Column(name = "mult_factor",nullable=true)
	private Double multFactor;
	
	@Column(name = "sales_price",nullable=true)
	private Double salesPrice;
	
	@Column(name = "tax",nullable=true)
	private String tax;
	
	@Column(name = "status",nullable=true)
	private String status;
	
	@Column(name = "type",nullable=true)
	private String type;
	
	@Column(name = "dummy_print",nullable=true)
	private String dummyPrint;
	
	@Column(name = "wt_piece",nullable=true)
	private Double wtPiece;
	
	@Column(name = "avg_disp_prc",nullable=true)
	private Double avgDispPrc;
	
	@Column(name = "date_saved",nullable=false)
	private Date dateSaved;
	
	@Column(name = "gold_price",nullable=true)
	private Double goldPrice;
	
	@Column(name = "in_memo_p",nullable=true)
	private Integer inMemoP;
	
	@Column(name = "in_memo_w",nullable=true)
	private Double inMemoW;
	
	@Column(name = "karat",nullable=true)
	private Double karat;
	
	@Column(name = "order_p",nullable=true)
	private Integer orderP;
	
	@Column(name = "order_w",nullable=true)
	private Double orderW;
	
	@Column(name = "confirm_order_p",nullable=true)
	private Integer confirmOrderP;
	
	@Column(name = "confirm_order_w",nullable=true)
	private Double confirmOrderW;
	
	@Column(name = "location_code",nullable=true)
	private String locationCode;
	
	@Column(name = "database_local",nullable=true)
	private String databaseLocal;
	
	@Column(name = "imagepath",nullable=true)
	private String imagepath;
	
	@Column(name = "category",nullable=true)
	private String category;
	
	@Column(name = "product_description",nullable=true)
	private String productDescription;
	
	@Column(name = "rank",nullable=true)
	private String rank;
	
	@Column(name = "discount_percent",nullable=true)
	private Double discountPercent;
	
	@Column(name = "discount_start",nullable=true)
	private Date discountStart;
	
	@Column(name = "discount_end",nullable=true)
	private Date discountEnd;
	
	@Column(name = "job_no",nullable=true)
	private String jobNo;
	
	@Column(name = "reorder_pc",nullable=true)
	private Double reorderPc;
	
	@Column(name = "reorder_wt",nullable=true)
	private Double reorderWt;
	
	@Column(name = "display_web",nullable=true)
	private String displayWeb;
	
	@Column(name = "excess_order_pc",nullable=true)
	private Double excessOrderPc;
	
	@Column(name = "current_ex_ord_pc",nullable=true)
	private Double currentExOrdPc;
	
	@Column(name = "excess_order_msg",nullable=true)
	private String excessOrderMsg;
	
	@Column(name = "gl_sales",nullable=true)
	private String glSales;
	
	@Column(name = "gl_sales_return",nullable=true)
	private String glSalesReturn;
	
	@Column(name = "gl_sales_discount",nullable=true)
	private String glSalesDiscount;
	
	@Column(name = "gl_cost_sold",nullable=true)
	private String glCostSold;
	
	@Column(name = "gl_inventory",nullable=true)
	private String glInventory;
	
	@Column(name = "small_image",nullable=true)
	private String smallImage;
	
	@Column(name = "large_image",nullable=true)
	private String largeImage;
	
	@Column(name = "material",nullable=true)
	private String material;
	
	@Column(name = "setting",nullable=true)
	private String setting;
	
	@Column(name = "draw_no",nullable=true)
	private String drawNo;
	
	@Column(name = "tray_no",nullable=true)
	private String trayNo;
	
	@Column(name = "packing",nullable=true)
	private String packing;
	
	@Column(name = "lead_time",nullable=true)
	private String leadTime;
	
	@Column(name = "design_image",nullable=true)
	private String designImage;
	
	@Column(name = "certificate",nullable=true)
	private String certificate;
	
	@Column(name = "image3",nullable=true)
	private String image3;
	
	@Column(name = "image4",nullable=true)
	private String image4;
	
	@Column(name = "image5",nullable=true)
	private String image5;
	
	@Column(name = "image6",nullable=true)
	private String image6;
	
	@Column(name = "image3_desc",nullable=true)
	private String image3Desc;
	
	@Column(name = "image4_desc",nullable=true)
	private String image4Desc;
	
	@Column(name = "image5_desc",nullable=true)
	private String image5Desc;
	
	@Column(name = "image6_desc",nullable=true)
	private String image6Desc;
	
	@Column(name = "broken_pieces",nullable=true)
	private Integer brokenPieces;
	
	@Column(name = "material_price",nullable=true)
	private Double materialPrice;
	
	@Column(name = "appraisal",nullable=true)
	private String appraisal;
	
	@Column(name = "labor",nullable=true)
	private Double labor;
	
	@Column(name = "thickness",nullable=true)
	private Double thickness;
	
	@Column(name = "selling_type",nullable=true)
	private String sellingType;
	
	@Column(name = "locking_type",nullable=true)
	private Long lockingType;
	
	@Column(name = "brand_id",nullable=true)
	private Long brandId;
	
	@Column(name = "limited_order",nullable=true)
	private String limitedOrder;
}
