package test.com.country;

import java.io.Serializable;
import java.util.Objects;

public class CountryVO implements Serializable{

	private String country_id;
	private String country_name;
	private int region_id;
	
	public CountryVO() {
		// TODO Auto-generated constructor stub
	}

	public CountryVO(String country_id, String country_name, int region_id) {
		super();
		this.country_id = country_id;
		this.country_name = country_name;
		this.region_id = region_id;
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

	public int getRegion_id() {
		return region_id;
	}

	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(country_id, country_name, region_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryVO other = (CountryVO) obj;
		return Objects.equals(country_id, other.country_id) && Objects.equals(country_name, other.country_name)
				&& region_id == other.region_id;
	}

	@Override
	public String toString() {
		return "CountryVO [country_id=" + country_id + ", country_name=" + country_name + ", region_id=" + region_id
				+ "]";
	}
	
	
}
