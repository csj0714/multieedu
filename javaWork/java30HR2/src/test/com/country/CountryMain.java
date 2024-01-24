package test.com.country;

import java.util.List;

public class CountryMain {

	public static void main(String[] args) {
		// 1.driver 
		CountryDAO dao = new CountryDAOimpl();
		
		//2. selectAll
		List<CountryVO> vos = dao.selectAll();
		for (CountryVO x : vos) {
			System.out.println(x);
		}
		System.out.println("==================");
		
		//3. selectAllContryJoinRegion
		List<CountryJoinRegionVO> vos2 = 
				dao.selectAllContryJoinRegion();
		for (CountryJoinRegionVO x : vos2) {
			System.out.println(x);
		}
		
	}//end main

}//end class
