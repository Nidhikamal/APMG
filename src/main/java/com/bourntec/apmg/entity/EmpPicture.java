package com.bourntec.apmg.entity;
  
import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
/**
 * @author Athulya Sajeev
 * Table representaion for emp_picture
 */
@Getter
@Setter
@Entity
@Table(name = "emp_picture")
public class EmpPicture {	
	@Id
    @Column(name = "emp_id",nullable=true) 
	private String empId;
	@Column(name = "emp_picture",nullable=true)   
	private String empPicture;
	@Column(name = "location_code",nullable=true)   
	private String locationCode;
	@Column(name = "file_name",nullable=true)   
	private String fileName;
	@Column(name = "original_name",nullable=true)   
	private String originalName;
}