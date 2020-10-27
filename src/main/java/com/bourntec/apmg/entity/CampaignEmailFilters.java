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
 * @author Amal
 *
 */
@Getter
@Setter
@Entity
@Table(name = "campaign_email_filters")
public class CampaignEmailFilters {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",nullable=false)
	private Long id;
	
	@Column(name = "campaign_id",nullable=false)
    private Long campaignId;
    
	@Column(name = "send_to_type",nullable=true)
    private String sendToType;
    
	@Column(name = "search_type",nullable=true)
    private String searchType;
    
	@Column(name = "search_value",nullable=true)
    private String searchValue;
    
	@Column(name = "search_by",nullable=true)
    private String searchBy;
    
	@Column(name = "search_cust",nullable=true)
    private String selectedCust;
	
}
