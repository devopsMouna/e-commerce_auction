package com.ecommerce.auction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.auction.entities.Commande;
import com.ecommerce.auction.service.CommandeService;

@RestController
@RequestMapping("api/v1/commande")
public class CommandeController {
	
	@Autowired
	public CommandeService commandeService;

	@PostMapping("/save_cmd")
	public Commande saveCommande(Commande commande) {
		return commandeService.saveCommande(commande);
	}

	@GetMapping("/liste_cmd")
	public List<Commande> getalllistCommande() {
		return commandeService.getalllistCommande();
	}

	@GetMapping("/cmd/{id}")
	public Commande getCommandeByid(Long id) {
		return commandeService.getCommandeByid(id);
		
	}

	@DeleteMapping("/delete_cmd")
	public void deleteCommande(Long Commandeid) {
		commandeService.deleteCommande(Commandeid);
	}

	
}
