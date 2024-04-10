package com.ecommerce.auction.entities;

import com.ecommerce.auction.security.Model.User;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
public class Vendeur extends User{
	
	private String adresse;
	private String comptebancaire;
	
	@ManyToMany 
	private Article article;
	
	@ManyToMany
	private SocieteDeLivraison societeDeLivraision;
	
	

}