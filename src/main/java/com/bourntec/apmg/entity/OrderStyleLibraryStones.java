package com.bourntec.apmg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * Entity class for the table order_style_library_stones
 * 
 * @author Tinu
 *
 */
@Getter
@Setter
@Entity
@Table(name = "order_style_library_stones")
public class OrderStyleLibraryStones {
	@Id
	private	long id;
	private	double	orderStyleLibraryId;
	private	String	stoneId;
	private	String	shape;
	private	String	clarity;
	private	String	color;
	private	double	weight;
	private	double	stoneCost;
	private	String	setting;
	private	double	sizeMm;
	private	double	sizePointers;
	private	double	slNo;
	private	double	pieces;
	private	double	price;

}
