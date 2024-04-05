package com.bcanon.demo.repositoryimpl;

import java.util.ArrayList;

import com.bcanon.demo.model.City;
import com.bcanon.demo.model.Client;
import com.bcanon.demo.model.TypeDocument;
import com.bcanon.demo.repository.ClientRepository;

public class ClientRepositoryImpl implements ClientRepository
{
	ArrayList<Client> clientList = new ArrayList<>();

	@Override
	public Client getInfoClient(String documentType, String document) {
		fillClients();
		
		Client found = searchClient(documentType, document);
		
		return found;
		
	}
	
	public void fillClients() {
		clientList.add(new Client("123456", TypeDocument.C, "Andres Fernando", "Gutierrez Suarez", "3103141919", "Cra 19 #22A-10", City.BOGOTA));
		clientList.add(new Client("456789", TypeDocument.C, "Luisa Fernanda", "Calderon Canon", "3103141920", "Cra 19 #22A-10", City.BOGOTA));
		clientList.add(new Client("23445322", TypeDocument.P, "Daniel Alberto", "Mendez Mendez", "3103141921", "Cra 19 #22A-10", City.BUCARAMANGA));
	}
	
	public Client searchClient(String documentType, String document) {
		Client found = null;
		boolean exist = false;
		for (Client client : clientList) {
			TypeDocument type = TypeDocument.valueOf(documentType);
			if(exist == false && client.getDocument().contains(document) ) 
			{
				if(type == TypeDocument.C || type == TypeDocument.P){
					found = client;
				}
			}
		}
		
		return found;
	}
	
}
