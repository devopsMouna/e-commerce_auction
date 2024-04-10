package com.ecommerce.auction.dto;



import com.ecommerce.auction.entities.Client;
import com.ecommerce.auction.security.Auth.RegisterRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto extends RegisterRequest{
	private String adresse;
	
	  public static Client toEntity(ClientDto request) {
		  return Client.builder()
				  .nom(request.getNom())
				  .prenom(request.getPrenom())
				  .email(request.getEmail())
				  .telephone(request.getTelephone())
				  .password(request.getPassword())
				  .role(request.getRole())
				  .build();
	    }

}

