package test.com;

import java.util.List;

public class RegionMain {

	public static void main(String[] args) {

		RegionDAO dao = new RegionDAOimpl();
		
		List<RegionVO> vos = dao.selectAll();
		for (RegionVO x : vos) {
			System.out.println(x);
		}
		
	}//end main

}//end class
