package com.bourntec.apmg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @Entity Table for Inventory2
 * @author Vidya. p
 *
 */
@Getter
@Setter
@Entity
@Table(name = "inventory2")

public class Inventory2 implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "item_code",nullable=false)
	private String itemCode;

	@Column(name = "description2",nullable=true)
	private String description2;

	@Column(name = "specification",nullable=true)
	private String specification;

	@Column(name = "specification2",nullable=true)
	private String specification2;

	@Column(name = "location",nullable=true)
	private String location;

	@Column(name = "puchase_w",nullable=true)
	private Double purchaseW;

	@Column(name = "purchase_p",nullable=true)
	private Integer purchaseP;

	@Column(name = "sold_w",nullable=true)
	private Double soldW;

	@Column(name = "sold_p",nullable=true)
	private Integer soldP;

	@Column(name = "return_w",nullable=true)
	private Double returnW;

	@Column(name = "return_p",nullable=true)
	private Integer returnP;

	@Column(name = "karat",nullable=true)
	private Double karat;

	@Column(name = "table_karat",nullable=true)
	private String tableKarat;

	@Column(name = "vendor1",nullable=true)
	private String vendor1;

	@Column(name = "vendor2",nullable=true)
	private String vendor2;

	@Column(name = "v_code1",nullable=true)
	private String VCode1;

	@Column(name = "v_code2",nullable=true)
	private String VCode2;

	@Column(name = "dept",nullable=true)
	private String dept;

	@Column(name = "in_order_p",nullable=true)
	private Integer inOrderP;

	@Column(name = "in_order_w",nullable=true)
	private Double inOrderW;

	@Column(name = "location_code",nullable=true)
	private String locationCode;

	@Column(name = "email",nullable=true)
	private String email;

	@Column(name = "tag_color",nullable=true)
	private String tagColor;

	@Column(name = "inscribe",nullable=true)
	private String inscribe;

	@Column(name = "bill_entry",nullable=true)
	private String billEntry;

	@Column(name = "country_code",nullable=true)
	private String countryCode;

	@Column(name = "memo_p",nullable=true)
	private Integer memoP;

	@Column(name = "memo_w",nullable=true)
	private Double memoW;

	@Column(name = "memo_return_p",nullable=true)
	private Integer memoReturnP;

	@Column(name = "memo_return_w",nullable=true)
	private Double memoReturnW;

	@Column(name = "stone_orgin",nullable=true)
	private String stoneOrgin;
	
	@Column(name = "style_name",nullable=true)
	private String styleName;
}
