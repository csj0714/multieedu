package test.com;

import java.util.List;

public class DepartmentMain {

	public static void main(String[] args) {
		
		
		DepartmentDAO dao = new DepartmentDAOimpl();
		
		List<DepartmentVO> vos = dao.selectAll();
		for (DepartmentVO x : vos) {
			System.out.println(x);
		}
		System.out.println("==============");
		
		List<DepartmentJoinLocationVO> vos2 = dao.selectAllDepartmentJoinLocation();
		for (DepartmentJoinLocationVO x : vos2) {
			System.out.println(x);
		}

	}//end main

}//end class
