package com.ecommerce.auction.service;



import java.util.List;


import com.ecommerce.auction.entities.Vendeur;



public interface VendeurService {
	
	public Vendeur saveVendeur(Vendeur vendeur);
	public List<Vendeur> getalllistVendeur();
    public Vendeur getVendeurByid(Long id);
    public void deleteVendeur(Long Vendeurid);
	
}
	
	


