package com.ecommerce.auction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.auction.entities.Paiment;
import com.ecommerce.auction.service.PaimentService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/v1/paiment")
public class PaimentController {
	@Autowired
	public PaimentService paimentService;

	@PostMapping("save_paiment")
	public Paiment savePaiment(@RequestBody Paiment paiment) {
		return paimentService.savePaiment(paiment);
	}

	@GetMapping("/liste_paiment")
	public List<Paiment> getalllistPaiment() {
		return paimentService.getalllistPaiment();
	}

	@GetMapping("/paiment/{id}")
	public Paiment getPaimentByid(@PathVariable Long id) {
		return paimentService.getPaimentByid(id);
	}

	@DeleteMapping
	public void deletePaiment(@PathVariable Long Paimentid) {
		paimentService.deletePaiment(Paimentid);
	}
	
	

}
