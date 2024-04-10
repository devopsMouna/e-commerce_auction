package com.ecommerce.auction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.auction.entities.Client;

public interface ClientRepos extends JpaRepository<Client, Long> {

}
