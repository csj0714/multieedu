package test.com;

import java.util.List;

public class LocationMain {

	public static void main(String[] args) {
		// 1.driver
		LocationDAO dao = new LocationDAOimpl();

		// 2. selectAll
		List<LocationVO> vos = dao.selectAll();
		for (LocationVO x : vos) {
			System.out.println(x);
		}
		System.out.println("==================");

		// 3. selectAllContryJoinRegion
		List<LocationJoinCountryVO> vos2 = dao.selectAllLocationJoinCountry();
		for (LocationJoinCountryVO x : vos2) {
			System.out.println(x);
		}

	}// end main

}// end class
