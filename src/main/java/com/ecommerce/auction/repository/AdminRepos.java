package com.ecommerce.auction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.auction.entities.Admin;

public interface AdminRepos extends JpaRepository<Admin, Long> {

}
