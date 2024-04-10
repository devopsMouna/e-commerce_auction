package com.ecommerce.auction.entities;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class InfoLivraison {
  
	private String livraisonid;
	private float coutlivraison;
	private String nomlivreur;
	private int numerolivreur;
	
	
	@OneToOne (mappedBy = "socDeLiv")
	private SocieteDeLivraison societeDeLivraision;
	
	@OneToMany
	private Panier panier;

}
