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
 * TNumber entity.
 * 
 * @author Srijini
 *
 */
@Getter
@Setter
@Entity
@Table(name = "tnumber")
public class TNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tno", nullable = false)
	private Long tno;

	@Column(name = "category", nullable = true)
	private String category;
	
	@Column(name = "style_createyn", nullable = true)
	private String styleCreateyn;
	
	@Column(name = "style_no", nullable = true)
	private String styleNo;

	@Column(name = "designer_id", nullable = true)
	private String designerId;
	
	@Column(name = "status", nullable = true)
	private String status;

	@Column(name = "cad_id", nullable = true)
	private String cadId;

	@Column(name = "cust_no", nullable = true)
	private String custNo;

	@Column(name = "cad_id1", nullable = true)
	private String cadId1;

	@Column(name = "render_id", nullable = true)
	private String renderId;

	@Column(name = "tdate", nullable = true)
	private Date tdate;

	@Column(name = "cad_date", nullable = true)
	private Date cadDate;

	@Column(name = "design_date", nullable = true)
	private Date designDate;

	@Column(name = "cad_date1", nullable = true)
	private Date cadDate1;

	@Column(name = "render_date", nullable = true)
	private Date renderDate;

	@Column(name = "notes", nullable = true)
	private byte[] notes;

	@Column(name = "designer_note", nullable = true)
	private byte[] designerNote;

	@Column(name = "cad_note", nullable = true)
	private byte[] cadNote;

	@Column(name = "brand_id", nullable = true)
	private Long brandId;

	@Column(name = "cad_note1", nullable = true)
	private byte[] cadNote1;

	@Column(name = "render_note", nullable = true)
	private byte[] renderNote;
}
