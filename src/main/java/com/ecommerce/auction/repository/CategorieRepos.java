package com.ecommerce.auction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.auction.entities.Categorie;

public interface CategorieRepos extends JpaRepository<Categorie, Long>{

}
