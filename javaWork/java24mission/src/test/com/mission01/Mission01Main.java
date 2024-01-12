package test.com.mission01;

import java.util.List;

public class Mission01Main {

	public static void main(String[] args) {
		System.out.println("Mission01....");

		// 1.********************************
		// MemberDAOimple 클래스의 전역변수 vos(List)를
		// MemberDAOimple 클래스의 생성자로 초기화한다.
		// 초기화 할때는 서로다른 임의의 회원10명을 추가한다.
		// **********************************
		MemberDAO dao = new MemberDAOimpl();
		System.out.println("================");

		// 2.********************************
		// MemberDAOimple 클래스의 전역변수 vos(List)에
		// 들어있는 모든내용을 메인에서 출력하세요
		// **********************************
		// selectAll
		List<MemberVO> vos = dao.selectAll();
		for (MemberVO x : vos) {
			System.out.println(x);
		}
		System.out.println("================");

		// 3.********************************
		// MemberDAOimple 클래스의 전역변수 vos(List)에
		// 들어있는 모든내용중
		// 3-1.검색키가 아이디이고 검색어가 admin인
		// 회원들만 메인에서 출력하세요
		// 3-2.그리고 검색키가 이름이고 검색어가 lee인
		// 회원들만 메인에서 출력하세요
		// **********************************
		// 3.searchList
		// 3-1.
		System.out.println("===id=============");
		vos = dao.searchList("id", "admin");
		for (MemberVO x : vos) {
			System.out.println(x);
		}

		// 3-2.
		System.out.println("===name=============");
		vos = dao.searchList("name", "lee");
		for (MemberVO x : vos) {
			System.out.println(x);
		}
		System.out.println("================");

		// 4.********************************
		// MemberDAOimple 클래스의 전역변수 vos(List)에
		// 들어있는 모든내용 중
		// 메인에서 VO에 담아서 전달한 번호의 회원정보만 받아서
		// 메인에서 출력하세요
		// **********************************
		// 4.selectOne
		MemberVO vo = new MemberVO();
		vo.setNum(6);

		MemberVO vo2 = dao.selectOne(vo);
		System.out.println("vo2:" + vo2);
		System.out.println("================");

		vo.setNum(6);
		vo.setId("a");
		vo.setPw("b");
		vo.setName("c");
		vo.setTel("d");

		int result = dao.update(vo);
		System.out.println(result);

		vo.setNum(7);
		vo.setId("a");
		vo.setPw("b");
		vo.setName("c");
		vo.setTel("d");

		result = dao.insert(vo);
		System.out.println(result);

		System.out.println("==================");
		vo.setNum(1);
		result = dao.delete(vo);
		System.out.println(result);
	}// end main

}// end class