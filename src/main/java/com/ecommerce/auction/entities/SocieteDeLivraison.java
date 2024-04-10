package com.ecommerce.auction.entities;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

public class SocieteDeLivraison {
	
    private long id;
    private String nomsociete;
    private String adresse;
    private int tel;

	@ManyToOne
	private Vendeur vendeur;
	
	@OneToOne (mappedBy = "infoliv")
	private InfoLivraison infoLivraison;

}
