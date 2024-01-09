package test.com;

import java.util.ArrayList;
import java.util.List;

public class MemberDAOimpl implements MemberDAO {

	@Override
	public List<MemberVO> selectAll(MemberVO m) {
		System.out.println("selectAll()...");
		System.out.println(m);
		List<MemberVO> list = new ArrayList<MemberVO>();

		for (int i = 0; i < 5; i++) {
			MemberVO m2 = new MemberVO();
			m2.setNum(1 + i);
			m2.setId("asd" + i);
			m2.setPw("as123" + i);
			m2.setName("홍길동" + i);
			m2.setTel("010" + i);

			list.add(m2);
		}

		return list;
	}

	@Override
	public List<MemberVO> selectAll() {

		List<MemberVO> list = new ArrayList<MemberVO>();

		for (int i = 0; i < 5; i++) {
			MemberVO m2 = new MemberVO();
			m2.setNum(1 + i);
			m2.setId("asd" + i);
			m2.setPw("as123" + i);
			m2.setName("홍길동" + i);
			m2.setTel("010" + i);

			list.add(m2);
		}
		return list;
	}

}
