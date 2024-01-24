package test.com.country;

import java.util.List;

public interface CountryDAO {

	public List<CountryVO> selectAll();
	
	public List<CountryJoinRegionVO> selectAllContryJoinRegion();
	
}
