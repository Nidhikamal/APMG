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
 * Table representaion for PrintShowMaster
 * @author Athulya Sajeev
 */
@Getter
@Setter
@Entity
@Table(name = "print_show_master")
public class PrintShowMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private Long id;
	@Column(name = "created_by",nullable=true)
	private String createdBy;
	@Column(name = "created_date",nullable=true)
	private Date createdDate;
	@Column(name = "total_pieces",nullable=true)
	private Integer totalPieces;
	@Column(name = "show_code",nullable=true)
	private String showCode;
	@Column(name = "status",nullable=true)
	private String status;
}