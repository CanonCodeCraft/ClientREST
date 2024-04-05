package com.bcanon.demo.repository;

import com.bcanon.demo.model.Client;

public interface ClientRepository 
{
	Client getInfoClient(String documentType, String document);
}
