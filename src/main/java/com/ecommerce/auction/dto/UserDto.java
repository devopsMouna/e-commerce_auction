package com.ecommerce.auction.dto;

import org.springframework.beans.BeanUtils;

import com.ecommerce.auction.security.Model.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
	
	public static UserDto fromEntity(User utilisateur) {
		
		UserDto utilisateurDto = new UserDto();
		BeanUtils.copyProperties(utilisateur, utilisateurDto);
		return utilisateurDto;
	}
	
    public static User toEntity(UserDto utilisateurdto) {
		
		User utilisateur = new User();
		BeanUtils.copyProperties(utilisateurdto, utilisateur);
		return utilisateur;

}}
