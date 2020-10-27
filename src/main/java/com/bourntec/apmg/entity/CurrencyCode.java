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
@Table(name = "currency_codes")
public class CurrencyCode {

	@Id
	@Column(name = "currency_code",nullable=false)
	private String currencyCode;

	@Column(name = "currency_name",nullable=false)
	private String currencyName;
	 
	@Column(name = "exchange_rate",nullable=false)
	private double exchangeRate;
}
