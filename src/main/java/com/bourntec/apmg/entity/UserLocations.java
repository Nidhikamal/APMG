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
 * UserLocations entity.
 * 
 * @author Nince
 */

@Getter
@Setter
@Entity
@Table(name = "user_locations")
public class UserLocations {


	@Column(name = "id", nullable = false)
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long id;
	
	@Column(name = "user_id", nullable = false)
	private String userId;
	
	@Column(name = "location", nullable = false)
	private String location;
}
