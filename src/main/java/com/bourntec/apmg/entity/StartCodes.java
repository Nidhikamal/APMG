package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Vidya.p Entity for point sale order data
 */
@Getter
@Setter
@Entity
@Table(name = "start_codes")
public class StartCodes {
	
	@Id
	@Column(name = "code_name", nullable = false)
	String codeName;
	
	@Column(name = "start_number", nullable = false)
	Double startNumber;
	
	@Column(name = "end_number", nullable = false)
	int endNumber;
	
	@Column(name = "start_char", nullable = true)
	String startChar;
	
	@Column(name = "end_char", nullable = true)
	String endChar ;
	
	@Column(name = "location_code", nullable = true)
	String locationCode;
	
	@Column(name = "addchar", nullable = true)
	String addchar;	
	
	@Column(name = "start_letter", nullable = true)
	String startLetter ;

}
