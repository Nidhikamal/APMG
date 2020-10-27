package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "order_style_library")
public class OrderStyleLibrary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "order_no", nullable = false)
	private String orderNo;

	@Column(name = "style", nullable = true)
	private String style;

	@Column(name = "option_name", nullable = true)
	private String optionName;

	@Column(name = "ordered_pieces", nullable = true)
	private Integer orderedPieces;

	@Column(name = "finished_pieces", nullable = true)
	private Integer finishedPieces;

	@Column(name = "large_image", nullable = true)
	private String largeImage;

	@Column(name = "small_image", nullable = true)
	private String smallImage;

	@Column(name = "style_library_id", nullable = true)
	private Long styleLibraryId;

	@Column(name = "status", nullable = true)
	private String status;

	@Column(name = "sl_no", nullable = true)
	private Integer slNo;

	@Column(name = "item_size", nullable = true)
	private String itemSize;

	@Column(name = "email_id", nullable = true)
	private String emailId;

	@Column(name = "promised_date", nullable = true)
	private Date promisedDate;

	@Column(name = "item_cost", nullable = true)
	private Double itemCost;

	@Column(name = "labor", nullable = true)
	private Double labor;

}
