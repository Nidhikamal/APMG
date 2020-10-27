package com.bourntec.apmg.entity;
  
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
/**
 * @author Athulya Sajeev
 * Table representaion for employee_work
 */
@Getter
@Setter
@Entity
@Table(name = "employee_work")
public class EmployeeWork {	
	@Id
    @Column(name = "id",nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "emp_id",nullable=false)   
	private String empId;	
	@Column(name = "work_type",nullable=true)   
	private String workType;
}