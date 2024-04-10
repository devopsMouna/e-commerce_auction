package com.ecommerce.auction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.auction.entities.Paiment;

public interface PaimentRepos extends JpaRepository<Paiment, Long> {

}
