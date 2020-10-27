package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "memo_billing")
public class MemoBilling {
	@Id
	@Column(name = "memo_no", nullable = false)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String memoNo;

	private String addressName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private String billName;
	private String zips;
	private String locationCode;
	private String phone1;

}
