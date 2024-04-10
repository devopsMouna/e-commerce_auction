package com.ecommerce.auction.service;



import java.util.List;

import com.ecommerce.auction.entities.Article;


public interface ArticleService {
	

	public Article saveArticle(Article article);
	public List<Article> getalllistArticle();
    public Article getArticleByid(Long id);
	public List<Article> rechercheparmotclé(String mb);
    public void deleteArticle(Long Articleid);
	

}
