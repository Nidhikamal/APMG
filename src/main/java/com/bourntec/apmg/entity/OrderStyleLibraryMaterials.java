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
@Table(name = "order_style_library_materials")
public class OrderStyleLibraryMaterials{
@Id
@Column(name = "id")
private Long id;

@Column(name = "sl_no")
private Long slNo;

@Column(name = "material")
private String material;

@Column(name = "color")
private String color;

@Column(name = "mat_cost")
private Double matCost;

@Column(name = "order_style_library_id")
private Long orderStyleLibraryId;

@Column(name = "weight")
private Double weight;

@Column(name = "karat")
private Double karat;

}