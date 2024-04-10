package com.ecommerce.auction.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.auction.entities.Article;
import com.ecommerce.auction.service.ArticleService;

@RestController
@RequestMapping("api/v1/article")
public class ArticleController {
	@Autowired
	public ArticleService articleService;

	@PostMapping("/save_article")
	public Article saveArticle(@RequestBody Article article) {
		return articleService.saveArticle(article);
	}

	@GetMapping("/list_article")
	public List<Article> getalllistArticle() {
		return articleService.getalllistArticle();
	}

	@GetMapping("/article/{id}")
	public Article getArticleByid(@PathVariable Long id) {
		return articleService.getArticleByid(id);
	}

	@GetMapping("/article_recherche_ma")
	public List<Article> rechercheparmotclé(@PathVariable String ma) {
		return articleService.rechercheparmotclé(ma);
	}

	@DeleteMapping("/delete_article")
	public void deleteArticle(Long Articleid) {
		articleService.deleteArticle(Articleid);
	}
	
	

}
