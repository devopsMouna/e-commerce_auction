package com.ecommerce.auction.service;

import java.util.List;

import com.ecommerce.auction.entities.SocieteDeLivraison;





public interface SocieteDeLivraisonService {

	public SocieteDeLivraison saveSocieteDeLivraison(SocieteDeLivraison societeDeLivraison);
	public List<SocieteDeLivraison> getalllistSocieteDeLivraison();
    public SocieteDeLivraison getSocieteDeLivraisonByid(Long id);
    public void deleteSocieteDeLivraison(Long SocieteDeLivraisonid);
    
}
