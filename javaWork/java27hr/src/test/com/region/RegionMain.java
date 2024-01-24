package test.com.region;

import java.util.ArrayList;
import java.util.List;

public class RegionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("RegionMain...");

		RegionDAO dao = new RegionDAOimpl();
		List<RegionVO> vos = dao.selectAll();

		for (RegionVO x : vos) {
			System.out.println(x);
		}
	}

}
