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
@Table(name = "location_employees")
public class LocationEmployee {
	@Id
	@Column(name = "id",nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "emp_id",nullable=false)
    private String empId;
	
	@Column(name = "name",nullable=false)
    private String name;
	
	@Column(name = "location_code",nullable=false)
    private String locationCode;
}
