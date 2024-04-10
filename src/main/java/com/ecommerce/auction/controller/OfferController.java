package com.ecommerce.auction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.auction.entities.Offer;
import com.ecommerce.auction.service.OfferService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/v1/offer")
public class OfferController {
	
	@Autowired
	public OfferService offerService;

	@PostMapping("/save_offer")
	public Offer saveOffer(@RequestBody Offer offer) {
		return offerService.saveOffer(offer);
	}

	@GetMapping("/liste_offer")
	public List<Offer> getalllistOffer() {
		return offerService.getalllistOffer();
	}

	@GetMapping("/offer/{id}")
	public Offer getOfferByid(@PathVariable Long id) {
		return offerService.getOfferByid(id);
	}

	@DeleteMapping("/delete_offer")
	public void deleteOffer(@PathVariable Long Offerid) {
		offerService.deleteOffer(Offerid);
	}
	
	

}
