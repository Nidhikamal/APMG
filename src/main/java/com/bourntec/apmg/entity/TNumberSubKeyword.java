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
 * TNumber entity.
 * 
 * @author Srijini
 *
 */
@Getter
@Setter
@Entity
@Table(name = "tnumber_sub_keyword")
public class TNumberSubKeyword {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "key_id", nullable = true)
	private String keyId;

	@Column(name = "sub_key_id", nullable = true)
	private String subKeyId;

	@Column(name = "tno", nullable = true)
	private Long tno;

}
