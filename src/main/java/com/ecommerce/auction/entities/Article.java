package com.ecommerce.auction.entities;


import java.util.Date;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long Id;
	private String nom;
	private float coutarticle;
	private Date datepublication;
	private String description;
	private int quantite;
	
	
	@ManyToOne 
	private Vendeur vendeur;
	
	@ManyToOne
	private Client client;
	
	@ManyToOne
	private Commande commande;
	
	@ManyToOne
	private Categorie categorie;
	
	@OneToOne
	private InfoLivraison infoLivraison;
	
	
	

}
