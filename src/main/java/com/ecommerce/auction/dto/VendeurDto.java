package com.ecommerce.auction.dto;

import com.ecommerce.auction.entities.Vendeur;
import com.ecommerce.auction.security.Auth.RegisterRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class VendeurDto extends RegisterRequest{
	private String adresse;
	private String comptebancaire;
	
	  public static Vendeur toEntity(VendeurDto request) {
		  return Vendeur.builder()
				  .nom(request.getNom())
				  .prenom(request.getPrenom())
				  .email(request.getEmail())
				  .telephone(request.getTelephone())
				  .password(request.getPassword())
				  .adresse(request.getAdresse())
				  .comptebancaire(request.getComptebancaire())
				  .role(request.getRole())
				  .build();
	    }
}
