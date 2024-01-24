package test.com.country;

public interface CountrySQL {
	String SELECT_ALL_COUNTRY = "select * from countries order by country_id asc";
	String SELECT_ALL_COUNTRY_JOIN_REGION = "select country_id,country_name,region_id,region_name "
			+ "from countries join regions " + "using(region_id) " + "order by country_id asc";
}
