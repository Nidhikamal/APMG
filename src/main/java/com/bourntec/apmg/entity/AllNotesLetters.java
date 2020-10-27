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
@Table(name = "all_notes_letters")
public class AllNotesLetters {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "unique_id", nullable = false)
	private Long uniqueId;

	@Column(name = "doc_id", nullable = false)
	private String docId;

	@Column(name = "created_by", nullable = true)
	private String createdBy;

	@Column(name = "created_date", nullable = true)
	private Date createdDate;

	@Column(name = "modified_by", nullable = true)
	private String modifiedBy;

	@Column(name = "modified_date", nullable = true)
	private Date modifiedDate;

	@Column(name = "subject", nullable = true)
	private String subject;

	@Column(name = "long_notes", nullable = true)
	private byte[] longNotes;

	@Column(name = "location_code", nullable = true)
	private String locationCode;

	@Column(name = "footer", nullable = true)
	private byte[] footer;

	@Column(name = "letter_date", nullable = true)
	private Date letterDate;

	@Column(name = "address", nullable = true)
	private String address;

	@Column(name = "email", nullable = true)
	private String email;

	@Column(name = "type", nullable = true)
	private String type;

}
