/**
 * 
 */
package com.bourntec.apmg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Nince
 *
 */

@Getter
@Setter
@Entity
@Table(name = "point_sale_shipping")
public class PointSaleShipping {

	@Id
	@Column(name = "inv_no", nullable = false)
	private String invNo;
	
	@Column(name = "tracking_no", nullable = true)
	private String trackingNo;
	
	@Column(name = "ship_via", nullable = true)
	private String shipVia;
	
	@Column(name = "desc2", nullable = true)
	private String desc2;
	
	@Column(name = "location_code", nullable = true)
	private String locationCode;
	
	@Column(name = "ship_date", nullable = true)
	private Date shipDate;
	
	@Column(name = "service_type", nullable = true)
	private String serviceType;
	
	@Column(name = "shipment_weight", nullable = true)
	private Double shipmentWeight;

}
