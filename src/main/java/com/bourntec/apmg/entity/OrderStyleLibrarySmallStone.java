package com.bourntec.apmg.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
/**
 * Enitiy class  for order_style_library_small_stone Entity
 * @author Tinu
 *
 */

@Getter
@Setter
@Entity
@Table(name = "order_style_library_small_stone")
public class OrderStyleLibrarySmallStone{

@Id
private Long id;

@Column(name = "order_style_library_id")
private Long orderStyleLibraryId;

@Column(name = "item_code")
private String itemCode;

private String shape;

private String clarity;

private String color;

private Double weight;

@Column(name = "style_size")
private Double styleSize;

private Double pointers;

private String setting;

private Long pieces;

private Double price;

private Double total;

@Column(name = "stone_id")
private String stoneId;

}