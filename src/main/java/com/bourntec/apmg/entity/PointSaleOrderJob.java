package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Vidya.p Entity for point sale order job
 */

@Getter
@Setter
@Entity
@Table(name = "point_sale_order_job")
public class PointSaleOrderJob {

	@Id
	@Column(name = "ord_sl_no", nullable = false)
	private Long ordSlNo;

	@Column(name = "order_no", nullable = false) 
	private String orderNo;

	@Column(name = "job_no", nullable = false)
	private String jobNo;

	@Column(name = "desc1", nullable = true)
	private String desc1;

	@Column(name = "item_wt", nullable = true)
	private Double itemWt;

	@Column(name = "no_pc_p", nullable = false)
	private Long noPcP;

	@Column(name = "no_pc_w", nullable = true)
	private Double noPcW;

	@Column(name = "unit_price", nullable = true)
	private Double unitPrice;

	@Column(name = "gold_price", nullable = true)
	private Double goldPrice;

	@Column(name = "karat", nullable = true)
	private Double karat;

	@Column(name = "my_cost", nullable = true)
	private Double myCost;

	@Column(name = "item_cost", nullable = true)
	private Double itemCost;

	@Column(name = "mark_up", nullable = true)
	private Double markUp;

	@Column(name = "type", nullable = true)
	private String type;

	@Column(name = "job_desc", nullable = true)
	private String jobDesc;

	@Column(name = "used_pc_p", nullable = true)
	private Long usedPcP;

	@Column(name = "used_pc_w", nullable = true)
	private Double usedPcW;

	@Column(name = "trans", nullable = true)
	private String trans;

	@Column(name = "wt_pc", nullable = true)
	private String wtPc;

	@Column(name = "confirm_ord", nullable = true)
	private Double confirmOrd;

	@Column(name = "location_code", nullable = true)
	private String locationCode;

	@Column(name = "tax_yesno", nullable = true)
	private String taxYesno;

	@Column(name = "number_dummy", nullable = true)
	private Double numberDummy;

	@Column(name = "string_dummy", nullable = true)
	private String stringDummy;

	@Column(name = "special_dummy", nullable = true)
	private String specialDummy;

	@Column(name = "unit_charge", nullable = true)
	private String unitCharge;

	@Column(name = "units_required", nullable = true)
	private Double unitsRequired;

	@Column(name = "unit_charge_units", nullable = true)
	private Double unitChargeUnits;

	@Column(name = "discount_id", nullable = true)
	private String discountId;

	@Column(name = "discount_percent", nullable = true)
	private Double discountPercent;

	@Column(name = "discount_item", nullable = true)
	private Double discountItem;

	@Column(name = "color", nullable = true)
	private String color;

	@Column(name = "size", nullable = true)
	private Double size;

	@Column(name = "priority", nullable = true)
	private String priority;

	@Column(name = "attachment", nullable = true)
	private String attachment;

	@Column(name = "email_id", nullable = true)
	private String emailId;

	@Column(name = "specification", nullable = true)
	private String specification;

	@Column(name = "manf_status", nullable = true)
	private String manfStatus;

	@Column(name = "new_job_no", nullable = true)
	private String newJobNo;

	@Column(name = "manf_pc", nullable = true)
	private Double manfPc;

	@Column(name = "send_mail_YN", nullable = true)
	private String sendMailYN;

	@Column(name = "promised_date", nullable = true)
	private Date promisedDate;

}
