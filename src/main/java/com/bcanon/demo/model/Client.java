package com.bcanon.demo.model;

public class Client 
{
	private String document;
	private TypeDocument documentType;
	private String names;
	private String lastNames;
	private String phone;
	private String direction;
	private City city;
	
	public Client() {
		
	}
	
	public Client(String document, TypeDocument documentType, String names, String lastNames, String phone,
			String direction, City city) {
		super();
		this.document = document;
		this.documentType = documentType;
		this.names = names;
		this.lastNames = lastNames;
		this.phone = phone;
		this.direction = direction;
		this.city = city;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public TypeDocument getDocumentType() {
		return documentType;
	}

	public void setDocumentType(TypeDocument documentType) {
		this.documentType = documentType;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getLastNames() {
		return lastNames;
	}

	public void setLastNames(String lastNames) {
		this.lastNames = lastNames;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Client [document=" + document + ", documentType=" + documentType + ", names=" + names + ", lastNames="
				+ lastNames + ", phone=" + phone + ", direction=" + direction + ", city=" + city + "]";
	}
	
	
	
	
}
