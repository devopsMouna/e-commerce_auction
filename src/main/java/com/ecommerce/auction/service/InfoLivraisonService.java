package com.ecommerce.auction.service;

import java.util.List;

import com.ecommerce.auction.entities.InfoLivraison;
import com.ecommerce.auction.entities.Vendeur;

public interface InfoLivraisonService {

	public InfoLivraison saveInfoLivraison(InfoLivraison infolivraison);
	public List<InfoLivraison> getalllistInfoLivraison();
    public InfoLivraison getInfoLivraisonByid(Long id);
    public void deleteInfoLivraison(Long InfoLivraisonid);

}
