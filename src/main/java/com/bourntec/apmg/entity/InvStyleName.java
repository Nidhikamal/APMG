package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * Class is used as a RequestDTO for  StyleName
 * 
 * @author vidya.p
 *
 */
@Getter
@Setter
@Entity
@Table(name = "inv_style_name")
public class InvStyleName {

	@Id
	@Column(name = "style_id")
	private String styleId;
	@Column(name = "style_name")
	private String styleName;

}
