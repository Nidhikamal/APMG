package com.bourntec.apmg.entity.embaddable;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import com.bourntec.apmg.entity.PassModuleOptionList;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Hold the composite keys of @Entity PassAccessList
 * 
 * @author Srijini T.S
 *
 */
@Data
@NoArgsConstructor
@Embeddable
public class PassAccessListId implements Serializable {
	private static final long serialVersionUID = -2517851941873251699L;

	/*
	 * @Where(clause = "status = " + DBConstant.YES +" AND account_disabled = " +
	 * DBConstant.NO)
	 * 
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "user_id") private PassTable passTable;
	 */
	@Column(name = "user_id", nullable = false)
	private String userId;

	@Column(name = "option_name", nullable = false)
	private String optioName;

	@Column(name = "module_name", nullable = false)
	private String moduleName;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumns({
	 * 
	 * @JoinColumn(name = "option_name", referencedColumnName = "option_name",
	 * insertable = true,updatable = true),
	 * 
	 * @JoinColumn(name = "module_name", referencedColumnName = "module_name",
	 * insertable = true,updatable = true) })
	 * 
	 * private PassModuleOptionList moduleOptionList;
	 */

}
