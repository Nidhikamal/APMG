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
 * TNumberAttachment entity.
 * 
 * @author Srijini
 *
 */
@Getter
@Setter
@Entity
@Table(name = "tnumber_attachment")
public class TNumberAttachment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "tno", nullable = true)
	private Long tno;
	
	@Column(name = "fileid", nullable = true)
	private String fileid;
	
	@Column(name = "type", nullable = true)
	private String type;
}
