package com.bourntec.apmg.entity;
  
import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
/**
 * @author Athulya Sajeev
 * Table representaion for emp_work_type
 */
@Getter
@Setter
@Entity
@Table(name = "emp_work_type")
public class EmpWorkType {	
	@Id
    @Column(name = "work_name",nullable=true) 
	private String workName;
	@Column(name = "location_code",nullable=true)   	
	private String locationCode;
}