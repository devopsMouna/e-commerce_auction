package com.ecommerce.auction.serviceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.auction.entities.Article;
import com.ecommerce.auction.repository.ArticleRepos;
import com.ecommerce.auction.service.ArticleService;





@Service

public class ArticleServImpl implements ArticleService {
	
	@Autowired
	public ArticleRepos articleRepos;

	@Override
	public Article saveArticle(Article article) {
		
		return articleRepos.save(article);
	}

	@Override
	public List<Article> getalllistArticle() {
		
		return articleRepos.findAll();
	}

	@Override
	public Article getArticleByid(Long id) {
		
		return articleRepos.getById(id);
	}

	@Override
	public List<Article> rechercheparmotclé(String mb) {
		
		return null;
	}

	@Override
	public void deleteArticle(Long Articleid) {
		
		
	}

}
