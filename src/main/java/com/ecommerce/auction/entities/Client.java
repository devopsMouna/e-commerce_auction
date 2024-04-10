package com.ecommerce.auction.entities;



import com.ecommerce.auction.security.Model.User;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Client extends User {
	
	private String adresse;
	
	@OneToMany (mappedBy = "article")
	private Article article;
	
	@OneToMany (mappedBy = "cmd")
	private Commande commande;
	
	@OneToOne (mappedBy = "panier")
	private Panier panier;
	
}
