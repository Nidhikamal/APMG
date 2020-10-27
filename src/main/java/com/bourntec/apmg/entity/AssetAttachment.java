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
 * @author Amal
 *
 */
@Getter
@Setter
@Entity
@Table(name = "asset_attachment")
public class AssetAttachment {

	@Id
	@Column(name = "attach_id",nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer attachId;
	
	@Column(name = "asset_id",nullable=false)
	 private String assetId;
	
	@Column(name = "file_id",nullable=true)
	 private String fileId;
}
