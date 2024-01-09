package test.com;

import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberVO vo = new MemberVO();
		MemberDAO dao = new MemberDAOimpl();

		vo.setNum(11);
		vo.setId("asd");
		vo.setPw("as123");
		vo.setName("홍길동");
		vo.setTel("010");

		int result = dao.insert(vo);
		System.out.println(result);

		vo.setNum(11);
		vo.setId("asd");
		vo.setPw("as123");
		vo.setName("홍길동");
		vo.setTel("010");

		result = dao.update(vo);
		System.out.println(result);

		result = dao.delete(vo);
		System.out.println(result);

		MemberVO result2 = dao.selectOne(vo);
		System.out.println(result2);

		List<MemberVO> result3 = dao.selectAll();
		System.out.println(result3);

		result3 = dao.searchList("name", "홍길동");
		System.out.println(result3);

	}

}
