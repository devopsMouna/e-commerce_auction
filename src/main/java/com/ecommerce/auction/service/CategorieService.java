package com.ecommerce.auction.service;



import java.util.List;


import com.ecommerce.auction.entities.Categorie;



public interface CategorieService {
	
	public Categorie saveCategorie(Categorie categorie);
	public List<Categorie> getalllistCategorie();
    public Categorie getCategorieByid(Long id);
	public List<Categorie> rechercheparmotclé(String mb);
    public void deleteCategorie(Long Categorieid);
	

}
