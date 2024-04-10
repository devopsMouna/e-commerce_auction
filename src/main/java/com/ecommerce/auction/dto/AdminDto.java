package com.ecommerce.auction.dto;

import com.ecommerce.auction.entities.Admin;
import com.ecommerce.auction.security.Auth.RegisterRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AdminDto extends RegisterRequest{
	
	private boolean isAdmin;
	
	 public static Admin toEntity(AdminDto request) {
		  return Admin.builder()
				  .nom(request.getNom())
				  .prenom(request.getPrenom())
				  .email(request.getEmail())
				  .telephone(request.getTelephone())
				  .password(request.getPassword())
				  .role(request.getRole())
				  .isAdmin(request.isAdmin())
				  .build();
	    }
}
