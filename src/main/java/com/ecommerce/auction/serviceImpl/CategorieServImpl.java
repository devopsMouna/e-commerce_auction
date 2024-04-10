package com.ecommerce.auction.serviceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.auction.entities.Categorie;
import com.ecommerce.auction.repository.CategorieRepos;
import com.ecommerce.auction.service.CategorieService;

@Service
public class CategorieServImpl implements CategorieService {
	
	@Autowired
	public CategorieRepos categorieRepos;

	@Override
	public Categorie saveCategorie(Categorie categorie) {
		
		return categorieRepos.save(categorie);
	}

	@Override
	public List<Categorie> getalllistCategorie() {
		
		return categorieRepos.findAll();
	}

	@Override
	public Categorie getCategorieByid(Long id) {
		
		return categorieRepos.getById(id);
	}

	@Override
	public List<Categorie> rechercheparmotclé(String mb) {
		
		return null;
	}

	@Override
	public void deleteCategorie(Long Categorieid) {
		
		
	}


}
