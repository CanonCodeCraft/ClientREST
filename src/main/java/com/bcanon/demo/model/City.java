package com.bcanon.demo.model;

public enum City
{
	
	BOGOTA("Bogotá D.C"),
	MEDELLIN("Medellín"),
	CARTAGENA("Cartagena"),
	CALI("Cali"),
	BUCARAMANGA("Bucaramanga"),
	BARRANQUILLA("Barranquilla"),
	MANIZALES("Manizales"),
	IBAGUE("Ibagué"),
	PEREIRA("Pereira");

	City(String pDesc) {
		this.desc = pDesc;
	}
	
	private String desc;
	
	public String getDesc() {
		return this.desc;
	}
}
