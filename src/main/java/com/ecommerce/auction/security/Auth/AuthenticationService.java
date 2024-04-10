package com.ecommerce.auction.security.Auth;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.auction.dto.AdminDto;
import com.ecommerce.auction.dto.ClientDto;
import com.ecommerce.auction.dto.VendeurDto;
import com.ecommerce.auction.entities.Admin;
import com.ecommerce.auction.entities.Client;
import com.ecommerce.auction.entities.Vendeur;
import com.ecommerce.auction.security.Model.Role;
import com.ecommerce.auction.security.Model.Token;
import com.ecommerce.auction.security.Model.TokenType;
import com.ecommerce.auction.security.Model.User;
import com.ecommerce.auction.security.Repository.TokenRepository;
import com.ecommerce.auction.security.Repository.UserRepository;
import com.ecommerce.auction.security.configSecurity.JwtService;

import com.fasterxml.jackson.databind.ObjectMapper;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@Service

public class AuthenticationService  {
	@Autowired
  private  UserRepository repository;
  private  TokenRepository tokenRepository;
  private  PasswordEncoder passwordEncoder;
  private JwtService jwtService;
  private AuthenticationManager authenticationManager;

  public AuthenticationResponse register(RegisterRequest request) {
	  User user ;
		User savedUser = null ;
		if (request instanceof VendeurDto ) {
			user =new Vendeur();
			user = VendeurDto.toEntity((VendeurDto)request);
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			user.setRole(Role.ROLE_ADMIN);
			repository.save(user);
			 var jwtToken = jwtService.generateToken(user);
			   saveUserToken(savedUser, jwtToken);
		        return AuthenticationResponse.builder().accessToken(jwtToken).build();
	 
		       // var refreshToken = jwtService.generateRefreshToken(user);
		        
		}
		if (request instanceof ClientDto ) {
			user =new Client();
			user = ClientDto.toEntity((ClientDto)request);
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			user.setRole(Role.ROLE_ADMIN);
			repository.save(user);
			  
			   var jwtToken = jwtService.generateToken(user);
			   saveUserToken(savedUser, jwtToken);
		        return AuthenticationResponse.builder().accessToken(jwtToken).build();
	 
		       // var refreshToken = jwtService.generateRefreshToken(user);
		}
		
		if (request instanceof AdminDto ) {
			user =new Admin();
			user = AdminDto.toEntity((AdminDto)request);
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			user.setRole(Role.ROLE_ADMIN);
			repository.save(user);
			  
			   var jwtToken = jwtService.generateToken(user);
			   saveUserToken(savedUser, jwtToken);
		        return AuthenticationResponse.builder().accessToken(jwtToken).build();
	 
		       // var refreshToken = jwtService.generateRefreshToken(user);
		}
	  
    
    return null ;
       
  }

  public AuthenticationResponse authenticate(AuthenticationRequest request) {
    authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(
            request.getEmail(),
            request.getPassword()
        )
    );
    var user = repository.findByEmail(request.getEmail())
        .orElseThrow();
    var jwtToken = jwtService.generateToken(user);
    var refreshToken = jwtService.generateRefreshToken(user);
    revokeAllUserTokens(user);
    saveUserToken(user, jwtToken);
    return AuthenticationResponse.builder()
        .accessToken(jwtToken)
            .refreshToken(refreshToken)
        .build();
  }

  private void saveUserToken(User user, String jwtToken) {
    var token = Token.builder()
        .user(user)
        .token(jwtToken)
        .tokenType(TokenType.BEARER)
        .expired(false)
        .revoked(false)
        .build();
    tokenRepository.save(token);
  }

  private void revokeAllUserTokens(User user) {
    var validUserTokens = tokenRepository.findAllValidTokenByUser(user.getId());
    if (validUserTokens.isEmpty())
      return;
    validUserTokens.forEach(token -> {
      token.setExpired(true);
      token.setRevoked(true);
    });
    tokenRepository.saveAll(validUserTokens);
  }

  public void refreshToken(
          HttpServletRequest request,
          HttpServletResponse response
  ) throws IOException {
    final String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
    final String refreshToken;
    final String userEmail;
    if (authHeader == null ||!authHeader.startsWith("Bearer ")) {
      return;
    }
    refreshToken = authHeader.substring(7);
    userEmail = jwtService.extractUsername(refreshToken);
    if (userEmail != null) {
      var user = this.repository.findByEmail(userEmail)
              .orElseThrow();
      if (jwtService.isTokenValid(refreshToken, user)) {
        var accessToken = jwtService.generateToken(user);
        revokeAllUserTokens(user);
        saveUserToken(user, accessToken);
        var authResponse = AuthenticationResponse.builder()
                .accessToken(accessToken)
                .refreshToken(refreshToken)
                .build();
        new ObjectMapper().writeValue(response.getOutputStream(), authResponse);
      }
    }
  }
}
