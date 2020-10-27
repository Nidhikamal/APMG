package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

/**
 * TNumberHistory entity.
 * 
 * @author Srijini
 *
 */
@Getter
@Setter
@Entity
@Table(name = "tnumber_history")
public class TNumberHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "tno", nullable = false)
	private Long tno;

	@Column(name = "user_id", nullable = false)
	private String userId;

	@Column(name = "action", nullable = false)
	private String action;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date")
	Date createdDate;
}
