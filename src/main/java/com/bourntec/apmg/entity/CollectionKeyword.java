package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "collection_keyword")
public class CollectionKeyword {

	@Id
	@Column(name = "key_id",nullable=false)
	private String keyId;
	
	@Column(name = "key_name",nullable=false)
	private String keyName;
}
