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
@Table(name = "all_notes_short_notes")
public class AllNotesShortNotes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",nullable=false)
	private Long id;
	
	@Column(name = "doc_id",nullable=false)
	private String docId;
	
	@Column(name = "short_note_id",nullable=false)
	private String shortNoteId;
	
	@Column(name = "short_notes",nullable=true)
	private String shortNotes;
	
	@Column(name = "short_date",nullable=true)
	private Date shortDate;
	
	@Column(name = "location_code",nullable=true)
	private String locationCode;
}
