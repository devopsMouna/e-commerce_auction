package com.ecommerce.auction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.auction.entities.Offer;

public interface OfferRepos extends JpaRepository<Offer, Long> {

}
