package com.bourntec.apmg.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity class for shipping_type 
 * @author Tinu
 *
 */
@Getter
@Setter
@Entity
@Table(name = "shipping_type")
public class ShippingType{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name ="id")
private Long id;

@Column(name = "system")
private String system;

@Column(name = "display_web")
private String displayWeb;

@Column(name = "location_code")
private String locationCode;

@Column(name = "ship_type_name")
private String shipTypeName;

@Column(name = "ship_type")
private String shipType;

@Column(name = "ship_chg")
private Double shipChg;

@Column(name = "ship_code")
private String shipCode;

}