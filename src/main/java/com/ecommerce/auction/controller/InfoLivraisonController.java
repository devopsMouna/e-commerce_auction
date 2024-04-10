package com.ecommerce.auction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.auction.entities.InfoLivraison;
import com.ecommerce.auction.service.InfoLivraisonService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/v1/infosurlivraison")
public class InfoLivraisonController {
	
	@Autowired
	public InfoLivraisonService infoLivraisonService;

	@PostMapping("/save_infolivraison")
	public InfoLivraison saveInfoLivraison(@RequestBody InfoLivraison infolivraison) {
		return infoLivraisonService.saveInfoLivraison(infolivraison);
	}

	@GetMapping("/liste_infolivraison")
	public List<InfoLivraison> getalllistInfoLivraison() {
		return infoLivraisonService.getalllistInfoLivraison();
	}

	@GetMapping("/infolivraison/{id}")
	public InfoLivraison getInfoLivraisonByid(@PathVariable Long id) {
		return infoLivraisonService.getInfoLivraisonByid(id);
	}

	@DeleteMapping("delete_infolivraison")
	public void deleteInfoLivraison(@PathVariable Long InfoLivraisonid) {
		infoLivraisonService.deleteInfoLivraison(InfoLivraisonid);
	}
	
	

}
