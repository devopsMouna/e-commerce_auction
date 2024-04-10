package com.ecommerce.auction.dto;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.ecommerce.auction.entities.Article;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class ArticleDto {
	
	private long Id;
	private String nom;
	private float coutarticle;
	private Date datepublication;
	private String description;
	private int quantite;
	
	public static ArticleDto fromEntity(Article article) {
		
		ArticleDto articleDto =  new ArticleDto();
		BeanUtils.copyProperties(article, articleDto);
		return articleDto;
	}

	public static Article toEntity(ArticleDto articleDto) {
		
		Article article = new Article();
		BeanUtils.copyProperties(articleDto, article);
		return article;
	}
}
