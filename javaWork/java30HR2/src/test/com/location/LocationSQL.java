package test.com.location;

public interface LocationSQL {
	String SELECT_ALL_LOCATION = "select * from locations order by location_id asc";
	String SELECT_ALL_LOCATION_JOIN_COUNTRY = "select location_id,street_address,postal_code,"
			+ "city,state_province,country_id,country_name " + "from locations join countries " + "using(country_id) "
			+ "order by location_id asc";
}
