package com.ecommerce.auction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.auction.entities.Panier;

public interface PanierRepos extends JpaRepository<Panier, Long> {

}
