package br.com.immotechsolutions.integracaoapi.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PropertyResponse {
	
	 @JsonProperty("properties")
	 private List<Properties> propriedades;
	 private int page;
	 
	 
	public List<Properties> getPropriedades() {
		return propriedades;
	}
	public void setPropriedades(List<Properties> propriedades) {
		this.propriedades = propriedades;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	 
	 
}
