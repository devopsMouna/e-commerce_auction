package com.ecommerce.auction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.auction.entities.Panier;
import com.ecommerce.auction.service.PanierService;

@RestController
@RequestMapping("api/v1/panier")
public class PanierController {
	
	@Autowired
	public PanierService panierService;

	public Panier savePanier(Panier panier) {
		return panierService.savePanier(panier);
	}

	public List<Panier> getalllistPanier() {
		return panierService.getalllistPanier();
	}

	public Panier getPanierByid(Long id) {
		return panierService.getPanierByid(id);
	}

	public void deletePanier(Long Panierid) {
		panierService.deletePanier(Panierid);
	}
	
	
	

	
}
