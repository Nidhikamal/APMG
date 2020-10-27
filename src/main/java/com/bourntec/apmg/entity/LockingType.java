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
@Table(name = "locking_type")
public class LockingType {

	@Id
	@Column(name = "id",nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "description",nullable=false)
	private String description;
	
	@Column(name = "category",nullable=false)
	private String category;
	
	@Column(name = "image",nullable=true)
	private String image;
}
