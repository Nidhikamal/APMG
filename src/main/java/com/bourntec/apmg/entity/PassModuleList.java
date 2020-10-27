package com.bourntec.apmg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Entity Table for pass_module_list
 * @author Srijini T.S
 *
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "pass_module_list")

public class PassModuleList implements Serializable {
	private static final long serialVersionUID = -2517851941873251699L;
	@Id
	@Column(name = "module_name", nullable = false)
	private String moduleName;

	@Column(name = "description")
	private String description;

	@Column(name = "status", length = 1)
	private String status;

	@Column(name = "location_code")
	private String locCode;

	@Column(name = "module_description")
	private String moduleDescr;
}
