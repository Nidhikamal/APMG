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
 * @author meenu
 *
 */

@Getter
@Setter 
@Entity
@Table(name = "order_style_library_finding")
public class OrderStyleLibraryFinding {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	

	@Column(name = "order_style_library_id")
	private Integer orderStyleLibraryId;

	@Column(name = "item_code")
	private String itemCode;

	@Column(name = "pieces")
	private Integer Pieces;

	@Column(name = "price")
	private Integer price;

	@Column(name = "total")
	private Integer total;

	@Column(name = "wt_piece")
	private Integer wtPiece;

	@Column(name = "karat")
	private Integer karat;

	@Column(name = "material")
	private String material;

	
}
