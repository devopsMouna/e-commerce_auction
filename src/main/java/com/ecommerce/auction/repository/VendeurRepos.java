package com.ecommerce.auction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.auction.entities.Vendeur;

public interface VendeurRepos extends JpaRepository<Vendeur, Long> {

}
