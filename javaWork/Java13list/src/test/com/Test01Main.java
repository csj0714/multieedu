package test.com;

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
		List<MemberVO> list = dao.selectAll(m);

		System.out.println(list.size());

		for (MemberVO x : list) {
			System.out.println(x);
		}
		List<MemberVO> list2 = dao.selectAll(m);

		System.out.println(list2.size());

		for (MemberVO x : list2) {
			System.out.println(x);
		}
	}

}
