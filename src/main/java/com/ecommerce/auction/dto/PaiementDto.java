package com.ecommerce.auction.dto;

import org.springframework.beans.BeanUtils;

import com.ecommerce.auction.entities.Paiment;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PaiementDto {
	
	private long idpay;
	private float montant;
	
	public static PaiementDto fromEntity (Paiment paiment) {
		
		PaiementDto paiementDto = new PaiementDto();
		BeanUtils.copyProperties(paiment, paiementDto);
		return paiementDto ;	
	}
    public static Paiment toEntity (PaiementDto paimentdto) {
		
		Paiment paiement = new Paiment();
		BeanUtils.copyProperties(paimentdto, paiement);
		return paiement ;
}}
