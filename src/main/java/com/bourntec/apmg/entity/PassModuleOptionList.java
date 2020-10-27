package com.bourntec.apmg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bourntec.apmg.entity.embaddable.PassModuleOptionId;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Entity Table for pass_modules_options_list
 * @author Srijini T.S
 *
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "pass_modules_options_list")
public class PassModuleOptionList implements Serializable {
	private static final long serialVersionUID = -2517851941873251699L;
	/*
	 * @EmbeddedId PassModuleOptionId id;
	 */
	@Column(name = "module_name", nullable = false, insertable = true, updatable = true)
	private String moduleName;

	@Id
	@Column(name = "option_name", nullable = false, insertable = true, updatable = true)
	private String optionName;

	@Column(name = "description")
	private String description;

	@Column(name = "option_description")
	private String optionDesc;

	@Column(name = "location_code")
	private String locCode;

	@Column(name = "options_url")
	private String optionUrl;

	@Column(name = "menu_item_name")
	private String menuItemName;

}
