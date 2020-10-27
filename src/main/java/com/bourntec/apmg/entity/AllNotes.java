package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "all_notes")
public class AllNotes {

	@Id
	@Column(name = "unique_no",nullable=false)
	private String uniqueNo;
	
	@Column(name = "doc_id",nullable=false)
	private String docId;
	
	@Column(name = "doc_name",nullable=true)
	private String docName;
	
	@Column(name = "doc_subject",nullable=true)
	private String docSubject;
	
	@Column(name = "doc_date",nullable=true)
	private Date docDate;
	
	@Column(name = "created_date",nullable=true)
	private Date createdDate;
	
	@Column(name = "created_by",nullable=true)
	private String createdBy;
	
	@Column(name = "modified_date",nullable=true)
	private Date modifiedDate;
	
	@Column(name = "modified_by",nullable=true)
	private String modifiedBy;
	
	@Column(name = "type",nullable=true)
	private String type;

	@Column(name = "doc_notes",nullable=true)
	private byte[] docNotes;

@Column(name = "location_code",nullable=true)
	private String locationCode;
	
}
