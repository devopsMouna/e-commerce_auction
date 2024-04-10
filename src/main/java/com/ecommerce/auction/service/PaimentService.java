package com.ecommerce.auction.service;

import java.util.List;

import com.ecommerce.auction.entities.Paiment;


public interface PaimentService {

	public Paiment savePaiment(Paiment paiment);
	public List<Paiment> getalllistPaiment();
    public Paiment getPaimentByid(Long id);
    public void deletePaiment(Long Paimentid);
}
