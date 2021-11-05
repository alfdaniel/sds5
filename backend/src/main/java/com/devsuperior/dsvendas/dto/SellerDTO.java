package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

import lombok.Data;

@Data
public class SellerDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	
	public SellerDTO(Seller entity) {
		id = entity.getId();
		name = entity.getName();
	}
	
}
