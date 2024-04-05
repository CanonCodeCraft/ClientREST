package com.bcanon.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bcanon.demo.model.Client;
import com.bcanon.demo.repository.ClientRepository;
import com.bcanon.demo.repositoryimpl.ClientRepositoryImpl;

@RestController
@RequestMapping("/clients")
public class ClientController 
{
	
	private  ClientRepository clienteRepository = new ClientRepositoryImpl();
	
	@GetMapping("/get")
	public ResponseEntity<Client> getInfoClient(@RequestParam String pDocumentType,@RequestParam String pDocument)
	{
		try
		{
			if (!("C".equals(pDocumentType) || "P".equals(pDocumentType))) {
	            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null); // 400 - Bad Request
	        }
			
			Client clientAux = clienteRepository.getInfoClient(pDocumentType, pDocument);
			
			if(clientAux!=null) {
	            return ResponseEntity.status(HttpStatus.OK).body(clientAux); // 200 - OK
	        } else {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // 404 - Not Found
	        }
		}
		catch(Exception e) 
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null); // 500 - Internal Server Error
		}
		
	}
}
