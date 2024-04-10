package com.ecommerce.auction.entities;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

public class Panier {
	
	private long id;
	private String nomarticle;
	private int quantite;
	
	
	
	@OneToOne (mappedBy = "client")
	private Client client;
	
	@ManyToOne
	private InfoLivraison infoLivraison;

}
