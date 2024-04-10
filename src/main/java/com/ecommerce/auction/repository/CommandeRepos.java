package com.ecommerce.auction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.auction.entities.Commande;

public interface CommandeRepos extends JpaRepository<Commande, Long> {

	
}
