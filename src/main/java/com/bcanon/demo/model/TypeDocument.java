package com.bcanon.demo.model;

public enum TypeDocument {
		C("Cédula de Ciudadanía"),
		P("");
		
		TypeDocument(String pDesc) {
			this.desc = pDesc;
		}
		
		private String desc;
		
		public String getDesc() {
			return this.desc;
		}
}
