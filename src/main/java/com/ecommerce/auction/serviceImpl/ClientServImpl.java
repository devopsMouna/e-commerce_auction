package com.ecommerce.auction.serviceImpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.auction.entities.Client;
import com.ecommerce.auction.repository.ClientRepos;
import com.ecommerce.auction.service.ClientService;

@Service
public class ClientServImpl implements ClientService {
	
	@Autowired
	public ClientRepos clientRepos;

	@Override
	public Client saveClient(Client client) {
		
		return clientRepos.save(client);
	}

	@Override
	public List<Client> getalllistClient() {
		
		return clientRepos.findAll();
	}

	@Override
	public Client getClientByid(Long id) {
		
		return clientRepos.getById(id);
	}

	@Override
	public void deleteClient(Long Clientid) {
		
		
	}


}
