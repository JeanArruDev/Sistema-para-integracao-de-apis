package br.com.immotechsolutions.integracaoapi.entities;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {

	    @JsonProperty("id")
	    private int id;

	    @JsonProperty("created_at")
	    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	    private String createdAt;

	    @JsonProperty("updated_at")
	    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	    private String updatedAt;

	    @JsonProperty("type")
	    private String type;

	    @JsonProperty("code")
	    private String code;

	    @JsonProperty("name")
	    private String name;

	    @JsonProperty("url")
	    private String url;

	    @JsonProperty("bedrooms")
	    private Integer bedrooms;

	    @JsonProperty("bathrooms")
	    private Integer bathrooms;

	    @JsonProperty("half_bathrooms")
	    private Integer halfBathrooms;

	    @JsonProperty("suites")
	    private Integer suites;

	    @JsonProperty("maximum_occupancy")
	    private Integer maximumOccupancy;

	    @JsonProperty("maximum_children_occupancy")
	    private Integer maximumChildrenOccupancy;

	    @JsonProperty("minimum_main_guest_age")
	    private Integer minimumMainGuestAge;

	    @JsonProperty("parking_spaces")
	    private Integer parkingSpaces;

	    @JsonProperty("kitchens")
	    private Integer kitchens;

	    @JsonProperty("living_room")
	    private Integer livingRoom;

	    @JsonProperty("floors")
	    private Integer floors;

	    @JsonProperty("floor")
	    private Integer floor;

	    @JsonProperty("elevators")
	    private Integer elevators;

	    @JsonProperty("for_rent")
	    private Boolean forRent;

	    @JsonProperty("for_daily_rent")
	    private Boolean forDailyRent;

	    @JsonProperty("for_sale")
	    private Boolean forSale;

	    @JsonProperty("active")
	    private Boolean active;

	    @JsonProperty("minimum_rent_days")
	    private Integer minimumRentDays;

	    @JsonProperty("beach_distance")
	    private Double beachDistance;

	    @JsonProperty("country")
	    private Country country;

	    @JsonProperty("state")
	    private State state;

	    @JsonProperty("city")
	    private City city;

	    @JsonProperty("neighborhood")
	    private Neighborhood neighborhood;

	    @JsonProperty("prices")
	    private List<Price> prices;

	    @JsonProperty("photo")
	    private Photo photo;

	    @JsonProperty("photos")
	    private List<Photo> photos;
    

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(Integer bedrooms) {
		this.bedrooms = bedrooms;
	}

	public Integer getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(Integer bathrooms) {
		this.bathrooms = bathrooms;
	}

	public Integer getHalfBathrooms() {
		return halfBathrooms;
	}

	public void setHalfBathrooms(Integer halfBathrooms) {
		this.halfBathrooms = halfBathrooms;
	}

	public Integer getSuites() {
		return suites;
	}

	public void setSuites(Integer suites) {
		this.suites = suites;
	}

	public Integer getMaximumOccupancy() {
		return maximumOccupancy;
	}

	public void setMaximumOccupancy(Integer maximumOccupancy) {
		this.maximumOccupancy = maximumOccupancy;
	}

	public Integer getMaximumChildrenOccupancy() {
		return maximumChildrenOccupancy;
	}

	public void setMaximumChildrenOccupancy(Integer maximumChildrenOccupancy) {
		this.maximumChildrenOccupancy = maximumChildrenOccupancy;
	}

	public Integer getMinimumMainGuestAge() {
		return minimumMainGuestAge;
	}

	public void setMinimumMainGuestAge(Integer minimumMainGuestAge) {
		this.minimumMainGuestAge = minimumMainGuestAge;
	}

	public Integer getParkingSpaces() {
		return parkingSpaces;
	}

	public void setParkingSpaces(Integer parkingSpaces) {
		this.parkingSpaces = parkingSpaces;
	}

	public Integer getKitchens() {
		return kitchens;
	}

	public void setKitchens(Integer kitchens) {
		this.kitchens = kitchens;
	}

	public Integer getLivingRoom() {
		return livingRoom;
	}

	public void setLivingRoom(Integer livingRoom) {
		this.livingRoom = livingRoom;
	}

	public Integer getFloors() {
		return floors;
	}

	public void setFloors(Integer floors) {
		this.floors = floors;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public Integer getElevators() {
		return elevators;
	}

	public void setElevators(Integer elevators) {
		this.elevators = elevators;
	}

	public Boolean getForRent() {
		return forRent;
	}

	public void setForRent(Boolean forRent) {
		this.forRent = forRent;
	}

	public Boolean getForDailyRent() {
		return forDailyRent;
	}

	public void setForDailyRent(Boolean forDailyRent) {
		this.forDailyRent = forDailyRent;
	}

	public Boolean getForSale() {
		return forSale;
	}

	public void setForSale(Boolean forSale) {
		this.forSale = forSale;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getMinimumRentDays() {
		return minimumRentDays;
	}

	public void setMinimumRentDays(Integer minimumRentDays) {
		this.minimumRentDays = minimumRentDays;
	}

	public Double getBeachDistance() {
		return beachDistance;
	}

	public void setBeachDistance(Double beachDistance) {
		this.beachDistance = beachDistance;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Neighborhood getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(Neighborhood neighborhood) {
		this.neighborhood = neighborhood;
	}

	public List<Price> getPrices() {
		return prices;
	}

	public void setPrices(List<Price> prices) {
		this.prices = prices;
	}

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
	
	

    public ZonedDateTime getParsedCreatedAt() {
        return ZonedDateTime.parse(createdAt, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    public void setParsedCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    public ZonedDateTime getParsedUpdatedAt() {
        return ZonedDateTime.parse(updatedAt, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    public void setParsedUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }
    
		}

