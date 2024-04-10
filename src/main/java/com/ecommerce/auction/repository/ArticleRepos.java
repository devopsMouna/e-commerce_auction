package com.ecommerce.auction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.auction.entities.Article;

public interface ArticleRepos extends JpaRepository<Article, Long>{

}
