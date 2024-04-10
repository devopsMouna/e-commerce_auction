package com.ecommerce.auction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.auction.entities.Vendeur;
import com.ecommerce.auction.service.VendeurService;

@RestController
@RequestMapping("api/v1/vendeur")
public class VendeurController {
	
	@Autowired
	public VendeurService vendeurService;

	@PostMapping("/save_vendeur")
	public Vendeur saveVendeur(@RequestBody Vendeur vendeur) {
		return vendeurService.saveVendeur(vendeur);
	}

	@GetMapping("/list_vendeur")
	public List<Vendeur> getalllistVendeur() {
		return vendeurService.getalllistVendeur();
	}

	@GetMapping("/vendeur/{id}")
	public Vendeur getVendeurByid(Long id) {
		return vendeurService.getVendeurByid(id);
	}

	@DeleteMapping("/delete-vendeur")
	public void deleteVendeur(Long Vendeurid) {
		vendeurService.deleteVendeur(Vendeurid);
	}
	
	

}
