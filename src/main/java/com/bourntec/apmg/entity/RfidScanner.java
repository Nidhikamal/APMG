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
@Table(name ="rfid_scanner")
public class RfidScanner {
	
	@Id
	@Column(name = "unique_scanner_id",nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long uniqueScannerId;
	
	@Column(name = "rfid_scanner_name",nullable=false)
	private String rfidScannerName;
	
	@Column(name = "rfid_scanner_id",nullable=false)
	private String rfidScannerId;
	
	@Column(name = "rfid_scanner_status",nullable=true)
	private String rfidScannerStatus;
	
	@Column(name = "description",nullable=true)
	private String description;
}
