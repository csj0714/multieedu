package test.com.location;

import java.util.List;

public interface LocationDAO {

	public List<LocationVO> selectAll();

	public List<LocationJoinCountryVO> selectAllLocationJoinCountry();

}
