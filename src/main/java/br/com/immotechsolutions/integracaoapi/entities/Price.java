package br.com.immotechsolutions.integracaoapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Price {
    @JsonProperty("id")
    private int id;

    @JsonProperty("property_id")
    private int propertyId;
    
    @JsonProperty("price_period_id") 
    private int pricePeriodId;
    
    @JsonProperty("type")
    private String type;

    @JsonProperty("description")
    private String description;

    @JsonProperty("value")
    private String value;

    @JsonProperty("percentage_value")
    private String percentageValue;
    
    public Price() {
    	
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getPercentageValue() {
		return percentageValue;
	}

	public void setPercentageValue(String percentageValue) {
		this.percentageValue = percentageValue;
	}

	public int getPricePeriodId() {
		return pricePeriodId;
	}

	public void setPricePeriodId(int pricePeriodId) {
		this.pricePeriodId = pricePeriodId;
	}
    
    
}
