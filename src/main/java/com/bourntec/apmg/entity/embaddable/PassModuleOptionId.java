package com.bourntec.apmg.entity.embaddable;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Hold the composite keys of @Entity PassModuleOption 
 * @author Srijini T.S
 *
 */
@Embeddable
@Data
@NoArgsConstructor
public class PassModuleOptionId implements Serializable {

	private static final long serialVersionUID = -2517851941873251699L;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "module_name", insertable = true,updatable = true) private
	 * PassModuleList moduleList;
	 */

	@Column(name = "module_name", nullable = false,
			insertable = true,updatable = true)
	private String moduleName;

	@Column(name = "option_name", nullable = false,
			insertable = true,updatable = true)
	private String optionName;
}
