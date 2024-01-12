package test.com.mission01;

import java.util.List;

public class Test01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberVO m = new MemberVO();

		m.setNum(1);
		m.setId("asd123");
		m.setPw("as123");
		m.setName("kim11");
		m.setTel("010");
		MemberDAO dao = new MemberDAOimpl();
		MemberVO m2 = dao.selectOne(m);
		System.out.println(m2);

		List<MemberVO> list = dao.selectAll();
		System.out.println(list.size());

		for (MemberVO x : list) {
			System.out.println(x);
		}

		System.out.println(list.size());

		for (MemberVO x : list) {
			System.out.println(x);
		}
	}

}
