package com.ecommerce.auction.serviceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.auction.entities.Vendeur;
import com.ecommerce.auction.repository.VendeurRepos;
import com.ecommerce.auction.service.VendeurService;


@Service
public class VendeurServImpl implements VendeurService{
	
	@Autowired
	public VendeurRepos vendeurRepos;

	@Override
	public Vendeur saveVendeur(Vendeur vendeur) {
		
		return vendeurRepos.save(vendeur);
	}

	@Override
	public List<Vendeur> getalllistVendeur() {
		
		return vendeurRepos.findAll();
	}

	@Override
	public Vendeur getVendeurByid(Long id) {
		
		return vendeurRepos.getById(id);
	}

	@Override
	public void deleteVendeur(Long Vendeurid) {
		
		
	}

	

}
