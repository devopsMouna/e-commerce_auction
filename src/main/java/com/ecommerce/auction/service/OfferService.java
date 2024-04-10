package com.ecommerce.auction.service;

import java.util.List;

import com.ecommerce.auction.entities.Offer;



public interface OfferService {
	
	public Offer saveOffer(Offer offer);
	public List<Offer> getalllistOffer();
    public Offer getOfferByid(Long id);
    public void deleteOffer(Long Offerid);

}
