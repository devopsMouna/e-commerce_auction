package com.ecommerce.auction.dto;

import java.sql.Time;
import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.ecommerce.auction.entities.Offer;


import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class OfferDto {
	
	private long idoffer;
	private Date datedeclôture;
	private Time heuredefermeture;
	private boolean Status;
	private Date Datedevente;
	private Date date_enchère;
	
   public static OfferDto fromEntity (Offer offer) {
		
	    OfferDto offerdto = new OfferDto();
		BeanUtils.copyProperties(offer, offerdto);
		return offerdto ;	
	}
   public static Offer toEntity (OfferDto offerdto) {
		
	    Offer offer = new Offer();
		BeanUtils.copyProperties(offerdto, offer);
		return offer ;	
	}


}
