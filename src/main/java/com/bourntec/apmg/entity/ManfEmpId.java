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
 * Table representaion for manf_emp_id
 * @author Athulya
 */
@Getter
@Setter
@Entity
@Table(name = "manf_emp_id")
public class ManfEmpId {	 
	@Id
	@Column(name = "id",nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "job_no",nullable=true) 
	private String jobNo;
	@Column(name = "emp_id",nullable=true) 
	private String empId;
	@Column(name = "no_itemsw",nullable=true) 
	private Double noItemsW;
	@Column(name = "no_itemsp",nullable=true) 
	private Long noItemsP;
	@Column(name = "labor",nullable=true) 
	private Double labor;
	@Column(name = "amount",nullable=true) 
	private Double amount;
	@Column(name = "description",nullable=true) 
	private String description;
	@Column(name = "no_hours",nullable=true) 
	private Double noHours;
	@Column(name = "labor_hours",nullable=true) 
	private Double laborHours;
	@Column(name = "stones_taken",nullable=true) 
	private Double stonesTaken;
	@Column(name = "in_itemp",nullable=true) 
	private Long inItemP;
	@Column(name = "in_itemw",nullable=true) 
	private Double inItemW;
	@Column(name = "remark",nullable=true) 
	private String remark;
	@Column(name = "paymode",nullable=true) 
	private String payMode;
	@Column(name = "sno",nullable=true) 
	private Long sno;
	@Column(name = "work_type",nullable=true) 
	private String workType;
	@Column(name = "job_date",nullable=true) 
	private Date jobDate;
	@Column(name = "location_code",nullable=true) 
	private String locationCode;
	@Column(name = "batchno",nullable=true) 
	private String batchno;
	@Column(name = "userid",nullable=true) 
	private String userid;
	@Column(name = "job_ret",nullable=true) 
	private Date jobRet;
	@Column(name = "job_time",nullable=true) 
	private Date jobTime;
	@Column(name = "job_ret_time",nullable=true) 
	private Date jobRetTime;
	@Column(name = "user_id_return",nullable=true) 
	private String userIdReturn;
}