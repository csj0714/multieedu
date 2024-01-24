package test.com;

import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeDAO dao = new EmployeeDAOimpl();
		System.out.println("=================");

		//1.오늘사원이 한명 입사했어요.
		//	사원테이블에 등록하세요.
		//	사원정보는 임의의 정보를 입력하되 참조키를 유념해서 등록하세요.
//		EmployeeVO vo = new EmployeeVO();
//		vo.setFirst_name("GilDong");
//		vo.setLast_name("Hong");
//		vo.setEmail("Hong1004");
//		vo.setPhone_number("010.0000.0000");
//		vo.setHire_date("2024-01-23");
//		vo.setJob_id("AC_ACCOUNT");
//		vo.setSalary(4200);
//		vo.setCommission_pct(0);
//		vo.setManager_id(205);
//		vo.setDepartment_id(110);
//		
//		int result = dao.insert(vo);
//		System.out.println("result:"+result);
//		System.out.println("=================");
		
		
//		//2.GilDong Hong사원의 급여가 변경되었습니다.
//		//	Susan Mavris라는 사원의 급여와 같게 변경하세요.
//		//  서브쿼리 사용해서 변경하세요.
//		
//		int result = dao.update("GilDong Hong","Susan Mavris");
//		System.out.println("result:"+result);
//		System.out.println("=================");
		
//		//3. 207번사원이 퇴사했어요
//		//	사원테이블에서 삭제하세요
//		EmployeeVO vo = new EmployeeVO();
//		vo.setEmployee_id(207);
//		
//		int result = dao.delete(vo);
//		System.out.println("result:"+result);
//		System.out.println("=================");
		
//		//4. 206번 사원정보를 검색하세요
//		EmployeeVO vo = new EmployeeVO();
//		vo.setEmployee_id(206);
//		
//		EmployeeVO vo2 = dao.selectOne(vo);
//		System.out.println("vo2:"+vo2);
//		System.out.println("=================");
		
		//5.사원이름에 na가 포함된 사원들을 검색할 수도 있고,
		//  업무아이디에 MK가 포함된 사원들을 검색할 수도 있고,
		//	전화번호에 123을 포함하는 사원원들을 검색할 수있는 searchList메소드를 작성하세요
		
//		List<EmployeeVO> vos2 = dao.searchList("name","na");
//		List<EmployeeVO> vos2 = dao.searchList("job_id","MK");
		List<EmployeeVO> vos2 = dao.searchList("tel","123");
		for (EmployeeVO x : vos2) {
			System.out.println(x);
		}
		System.out.println("=================");
		
		
		// 주어진 pageBlock에 따라
		// 각페이지별(cpage) 시작행(startRow),끝행(endRow)을 이용해서 리미트 출력하는 프로그램
		List<EmployeeVO> vos = dao.selectAll(1, 5);
//		List<EmployeeVO> vos = dao.selectAll(1,10);
//		List<EmployeeVO> vos = dao.selectAll(2,10);
		for (EmployeeVO x : vos) {
			System.out.println(x);
		}
		System.out.println("=================");

	}// end main

}// end class
