package test.com.location;

import java.io.Serializable;
import java.util.Objects;

public class LocationJoinCountryVO implements Serializable {
	private int location_id;
	private String street_address;
	private String postal_code;
	private String city;
	private String state_province;
	private String country_id;
	private String country_name;

	public LocationJoinCountryVO() {
		// TODO Auto-generated constructor stub
	}

	public LocationJoinCountryVO(int location_id, String street_address, String postal_code, String city,
			String state_province, String country_id, String country_name) {
		super();
		this.location_id = location_id;
		this.street_address = street_address;
		this.postal_code = postal_code;
		this.city = city;
		this.state_province = state_province;
		this.country_id = country_id;
		this.country_name = country_name;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public String getStreet_address() {
		return street_address;
	}

	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState_province() {
		return state_province;
	}

	public void setState_province(String state_province) {
		this.state_province = state_province;
	}

	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, country_id, country_name, location_id, postal_code, state_province, street_address);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocationJoinCountryVO other = (LocationJoinCountryVO) obj;
		return Objects.equals(city, other.city) && Objects.equals(country_id, other.country_id)
				&& Objects.equals(country_name, other.country_name) && location_id == other.location_id
				&& Objects.equals(postal_code, other.postal_code)
				&& Objects.equals(state_province, other.state_province)
				&& Objects.equals(street_address, other.street_address);
	}

	@Override
	public String toString() {
		return "LocationJoinCountryVO [location_id=" + location_id + ", street_address=" + street_address
				+ ", postal_code=" + postal_code + ", city=" + city + ", state_province=" + state_province
				+ ", country_id=" + country_id + ", country_name=" + country_name + "]";
	}

}
