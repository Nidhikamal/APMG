package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "potential_group")
public class PotentialGroup {
	@Id
	@Column(name = "group_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long groupId;

	@Column(name = "group_name", nullable = false)
	private String groupName;

	@Column(name = "status", nullable = true)
	private String Status;
	
	@Column(name = "description", nullable = true)
	private String description;

}
