package com.ecommerce.auction.service;

import java.util.List;

import com.ecommerce.auction.entities.Commande;

public interface CommandeService {
	
	public Commande saveCommande(Commande commande);
	public List<Commande> getalllistCommande();
    public Commande getCommandeByid(Long id);
    public void deleteCommande(Long Commandeid);

}
