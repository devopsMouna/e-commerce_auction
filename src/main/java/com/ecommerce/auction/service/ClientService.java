package com.ecommerce.auction.service;



import java.util.List;


import com.ecommerce.auction.entities.Client;



public interface ClientService {
	
	public Client saveClient(Client client);
	public List<Client> getalllistClient();
    public Client getClientByid(Long id);
    public void deleteClient(Long Clientid);
}
