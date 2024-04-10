package com.ecommerce.auction.service;

import java.util.List;

import com.ecommerce.auction.entities.Panier;


public interface PanierService {

	public Panier savePanier(Panier panier);
	public List<Panier> getalllistPanier();
    public Panier getPanierByid(Long id);
    public void deletePanier(Long Panierid);
}
