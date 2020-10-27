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
 * @author Vidya.p Entity for inventory_library_size
 */
@Getter
@Setter
@Entity
@Table(name = "inventory_library_size")
public class InventoryLibrarySize {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	@Column(name = "library_id", nullable = false)
	private Long libraryId;

	@Column(name = "variant_size", nullable = true)
	private String variantSize;
	
	
}
