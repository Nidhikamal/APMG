package com.bourntec.apmg.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;


/**
 * Entity class for pass_table ie for user
 * @author Srijini
 *
 */
@Getter
@Setter
@Entity
@Table(name = "pass_table")
public class PassTable implements Serializable{
	private static final long serialVersionUID = -2517851941873251699L;
	@Id
	@Column(name = "user_id", nullable = false)
	private String userId;

	@Column(name = "password")
	private String password;

	@Column(name = "temp_lockout", length = 1)
	String tempLockout;

	@Column(name = "full_name")
	String fullName;

	@Column(name = "description")
	String description;

	@Column(name = "group_user", length = 1)
	String groupUser;

	@Column(name = "location_code")
	String locCode;

	@Column(name = "change_password", length = 15)
	String changePass;

	@Column(name = "password_lock", length = 1)
	String passLock;

	@Column(name = "stop_password_expiry", length = 1)
	String stopPassExpry;

	@Column(name = "account_disabled", length = 1)
	String accountDisabled;

	@Column(name = "last_invalid_access_date")
	Date lastInvalidAccessDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_invalid_access_time")
	Date lastInvalidAccessTime;// time without time zone

	@Column(name = "lockout_ctr")
	Long lockoutCtr;

	/*
	 * @Column(name = "descnt") String descnt;
	 */

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_time")
	Date startTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_time")
	Date endTime;

	@Column(name = "emp_id", length = 10)
	String empId;

	@Column(name = "logged_in", length = 1)
	String loggedIn;

	@Column(name = "multi_access", length = 1)
	String multiAccess;

	/*
	 * @Column(name = "fortune_index") BigDecimal fortune_index ;//numeric field
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_login")
	Date lastLogin;

	@Column(name = "access_imported", length = 5)
	String accessImported;
	
	/*
	 * @OneToMany(mappedBy = "passTable") List<PassAccessList> accessLists;
	 */

}
