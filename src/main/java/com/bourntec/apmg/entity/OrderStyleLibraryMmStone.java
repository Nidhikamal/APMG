package com.bourntec.apmg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "order_style_library_mm_stone")
public class OrderStyleLibraryMmStone{

@Id
@Column(name = "id")
private Long id;

@Column(name = "order_style_library_id")
private Long orderStyleLibraryId;

@Column(name = "item_code")
private String itemCode;

@Column(name = "shape")
private String shape;

@Column(name = "clarity")
private String clarity;

@Column(name = "color")
private String color;

@Column(name = "weight")
private Double weight;

@Column(name = "style_size")
private String styleSize;

@Column(name = "pointers")
private Double pointers;

@Column(name = "setting")
private String setting;

@Column(name = "pieces")
private Long pieces;

@Column(name = "price")
private Double price;

@Column(name = "total")
private Double total;

@Column(name = "stone_id")
private String stoneId;

}