package com.ecommerce.auction.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.auction.security.Model.Role;
import com.ecommerce.auction.security.Model.User;

public interface RoleRepos extends JpaRepository<Role, Long> {
 
	Optional<Role> findByName(String name);
}
