package com.ecommerce.auction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.auction.entities.SocieteDeLivraison;
import com.ecommerce.auction.service.SocieteDeLivraisonService;

@RestController
@RequestMapping("api/v1/SocDeLivraison")
public class SocDeLivController {

	@Autowired
	public SocieteDeLivraisonService societeDeLivraisonService;

	public SocieteDeLivraison saveSocieteDeLivraison(SocieteDeLivraison societeDeLivraison) {
		return societeDeLivraisonService.saveSocieteDeLivraison(societeDeLivraison);
	}

	public List<SocieteDeLivraison> getalllistSocieteDeLivraison() {
		return societeDeLivraisonService.getalllistSocieteDeLivraison();
	}

	public SocieteDeLivraison getSocieteDeLivraisonByid(Long id) {
		return societeDeLivraisonService.getSocieteDeLivraisonByid(id);
	}

	public void deleteSocieteDeLivraison(Long SocieteDeLivraisonid) {
		societeDeLivraisonService.deleteSocieteDeLivraison(SocieteDeLivraisonid);
	}
	
	
}
