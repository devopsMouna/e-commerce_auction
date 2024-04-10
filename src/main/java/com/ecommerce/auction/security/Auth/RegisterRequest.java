package com.ecommerce.auction.security.Auth;



import com.ecommerce.auction.security.Model.Role;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest{
	private Long cin;
	private String nom;
	private String prenom;
	private String email;
	private int telephone;
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Role role;

}
