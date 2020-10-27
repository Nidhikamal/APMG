package com.bourntec.apmg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Entity Table for pass_access_list
 * @author Srijini T.S
 *
 */
@Getter
@Setter
@NoArgsConstructor
@Entity(name = "PassAccessList")
@Table(name = "pass_access_list")
public class PassAccessList implements Serializable {
	private static final long serialVersionUID = -2517851941873251699L;

	/*
	 * @EmbeddedId PassAccessListId passId;
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "user_id", nullable = false)
	private String userId;
	
	@Column(name = "option_name", nullable = false)
	private String optionName;

	@Column(name = "module_name", nullable = false)
	private String moduleName;
	
	@Column(name = "access_status", length = 1)
	private String status;

	@Column(name = "description")
	private String description;

	@Column(name = "group_id")
	private String groupId;

	@Column(name = "location_code")
	private String locCode;

	@Column(name = "access_description")
	private String accessDescr;

	@Column(name = "imported", length = 1)
	private String imported;

	/*
	 * @Where(clause = "status = " + DBConstant.YES +" AND account_disabled = " +
	 * DBConstant.NO)
	 * 
	 * @ManyToOne
	 * 
	 * @MapsId("userId")
	 * 
	 * @JoinColumn(name = "user_id",insertable = true,updatable = true) private
	 * PassTable passTable;
	 */
	
	
	
	
	/*
	 * @ManyToOne
	 * 
	 * @MapsId("optionName")
	 * 
	 * @JoinColumn(name = "option_name") private PassModuleOptionList
	 * moduleOptionList;
	 * 
	 * @ManyToOne
	 * 
	 * @MapsId("moduleName")
	 * 
	 * @JoinColumn(name = "module_name") private PassModuleList moduleList;
	 */

}
