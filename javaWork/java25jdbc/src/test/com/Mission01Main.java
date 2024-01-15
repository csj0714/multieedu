package test.com;

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

		// 5.********************************
		// MemberDAOimple 클래스의 전역변수 vos(List)에
		// 들어있는 모든내용 중
		// 메인에서 VO에 담아서 전달한 내용(번호,아이디,비번,이름,폰번)으로
		// 회원정보를 변경하고 성공하면 1을 반환하도록
		// 메인에서 출력하세요
		// **********************************
		// 5.update
		vo = new MemberVO();
		vo.setNum(7);
		vo.setId("admin111");
		vo.setPw("hi11111");
		vo.setName("kim111");
		vo.setTel("0111");

		int result = dao.update(vo);
		System.out.println("result:" + result);
		System.out.println("================");

		// 6.********************************
		// MemberDAOimple 클래스의 전역변수 vos(List)에
		// 새로운 회원의 정보를
		// 메인에서 VO에 담아서 전달한 내용(번호,아이디,비번,이름,폰번)으로
		// 회원정보를 추가하고 성공하면 1을 반환하도록
		// 메인에서 출력하세요
		// **********************************
		// 6.insert
		vo = new MemberVO();
		vo.setNum(11);
		vo.setId("admin11");
		vo.setPw("hi1111");
		vo.setName("kim11");
		vo.setTel("011");

		result = dao.insert(vo);
		System.out.println("result:" + result);
		System.out.println("================");

		// 7.********************************
		// MemberDAOimple 클래스의 전역변수 vos(List)에
		// 새로운 회원의 정보를
		// 메인에서 VO에 담아서 전달한 내용(번호)으로
		// 회원정보를 삭제하고 성공하면 1을 반환하도록
		// 메인에서 출력하세요
		// **********************************
		// 7.delete
		vo = new MemberVO();
		vo.setNum(8);

		result = dao.delete(vo);
		System.out.println("result:" + result);
		System.out.println("================");

		// 잘 수정,입력,삭제되었는지 selectAll로 확인...
		vos = dao.selectAll();
		for (MemberVO x : vos) {
			System.out.println(x);
		}
		System.out.println("================");

	}// end main

}// end class