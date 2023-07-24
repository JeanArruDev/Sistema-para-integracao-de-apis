package br.com.immotechsolutions.integracaoapi.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class State {
	 	@JsonProperty("id")
	    private int id;

	    @JsonProperty("created_at")
	    private String createdAt;

	    @JsonProperty("updated_at")
	    private String updatedAt;

	    @JsonProperty("user_id")
	    private int userId;

	    @JsonProperty("country_id")
	    private int countryId;

	    @JsonProperty("code")
	    private String code;

	    @JsonProperty("name")
	    private String name;

	    @JsonProperty("active")
	    private boolean active;
    
    public State() {
    	
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
    

}
