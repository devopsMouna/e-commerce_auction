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

import com.ecommerce.auction.entities.Client;
import com.ecommerce.auction.service.ClientService;

@RestController
@RequestMapping("api/v1/client")
public class ClientController {
	
	@Autowired
	public ClientService clientService;

	@PostMapping("/save_client")
	public Client saveClient(@RequestBody Client client) {
		return clientService.saveClient(client);
	}

	@GetMapping("/list_client")
	public List<Client> getalllistClient() {
		return clientService.getalllistClient();
	}

	@GetMapping("/client/{id}")
	public Client getClientByid(@PathVariable Long id) {
		return clientService.getClientByid(id);
	}

	@DeleteMapping("/delete_client")
	public void deleteClient(@PathVariable Long Clientid) {
		clientService.deleteClient(Clientid);
	}
	
	

}
