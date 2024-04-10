package com.ecommerce.auction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.auction.entities.Categorie;
import com.ecommerce.auction.service.CategorieService;

@RestController
@RequestMapping
public class CategorieController {
	
	@Autowired
	public CategorieService categorieService;
 
	@PostMapping("/save_categorie")
	public Categorie saveCategorie(@RequestBody Categorie categorie) {
		return categorieService.saveCategorie(categorie);
	}

	@GetMapping("/list_categorie")
	public List<Categorie> getalllistCategorie() {
		return categorieService.getalllistCategorie();
	}

	@GetMapping("/categorie/{id}")
	public Categorie getCategorieByid(@PathVariable Long id) {
		return categorieService.getCategorieByid(id);
	}

	@GetMapping("/categorie_mc")
	public List<Categorie> rechercheparmotclé(@PathVariable String mc) {
		return categorieService.rechercheparmotclé(mc);
	}

	@DeleteMapping("/delete_categorie")
	public void deleteCategorie(@PathVariable Long Categorieid) {
		categorieService.deleteCategorie(Categorieid);
	}
	

	
}
