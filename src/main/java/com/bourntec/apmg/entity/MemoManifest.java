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
 * Table representaion for Memo Manifest
 * 
 * @author jinto varghese
 *
 */
@Getter
@Setter
@Entity
@Table(name = "memo_manifest")
public class MemoManifest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "memo_no")
	private String memoNo;
	
	@Column(name = "manifest_id")
	private Long manifestId;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "manifest_date")
	private Date manifestDate;
	
	@Column(name = "confirm_date")
	private Date confirmDate;
	
	@Column(name = "validity_date")
	private Date validityDate;
	
	@Column(name = "guarante_percentage")
	private Double guarantePercentage;
	
	@Column(name = "memo_mark_up")
	private Double memoMarkUp;


	// constructors

	public MemoManifest() {

	}

	public MemoManifest(String memoNo, String status, Date manifestDate, Long id, Long manifest, Long memopieces,
			Long returnpieces, Long soldpieces, String job, Date confirmDate, Date validityDate,
			Double guarantePercentage, Double memoMarkUp) {
		super();
		this.memoNo = memoNo;
		this.status = status;
		this.manifestDate = manifestDate;
		this.id = id;
		this.confirmDate = confirmDate;
		this.validityDate = validityDate;
		this.guarantePercentage = guarantePercentage;
		this.memoMarkUp = memoMarkUp;
	}
}
