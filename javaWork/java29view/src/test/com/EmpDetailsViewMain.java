package test.com;

import java.util.List;

public class EmpDetailsViewMain {

	public static void main(String[] args) {
		
		//EmpDetailsViewVO : 속성(HR.emp_details_view참고)
		//EmpDetailsViewDAO : + selectAll():List<EmpDetailsViewVO>
		//EmpDetailsViewDAO <---- EmpDetailsViewDAOimpl
		//jdbc연동해서 구현하세요
		
		EmpDetailsViewDAO dao = new EmpDetailsViewDAOimpl();
				
		List<EmpDetailsViewVO> vos = dao.selectAll();
		for (EmpDetailsViewVO x : vos) {
			System.out.println(x);
		}
		
	}//end main

}//end class
