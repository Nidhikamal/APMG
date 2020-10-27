package com.bourntec.apmg.entity;

import java.util.Date;

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
@Table(name = "all_notes_attachment")
public class AllNotesAttachment {

	@Id
	@Column(name = "attachment_no",nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long attachmentNo;
	
	@Column(name = "doc_id",nullable=false)
	private String docId;
	
	@Column(name = "attachment_date",nullable=true)
	private Date attachmentDate;
	
	@Column(name = "attachment_subject",nullable=true)
	private String attachmentSubject;
	
	@Column(name = "file_name",nullable=true)
	private String fileName;
	
	@Column(name = "location_code",nullable=true)
	private String locationCode;
	
	@Column(name = "file_size",nullable=true)
	private Long fileSize;
	
	@Column(name = "attachment_file",nullable=true)
	private String attachmentFile;
	
	@Column(name = "attachment_path",nullable=true)
	private String attachmentPath;
	
	@Column(name = "type",nullable=true)
	private String type;
}
