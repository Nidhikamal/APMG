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
 * Table representaion for PrintShowItems
 */
@Getter
@Setter
@Entity
@Table(name = "print_show_items")
public class PrintShowItems {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Long id;	
	@Column(name = "print_master_id",nullable=true)
	private Long printMasterId;
	@Column(name = "item_code",nullable=true)
	private String itemCode;	
	@Column(name = "pieces",nullable=true)
	private Integer pieces;
}