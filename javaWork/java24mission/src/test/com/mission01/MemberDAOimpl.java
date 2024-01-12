package test.com.mission01;

import java.util.ArrayList;
import java.util.List;

public class MemberDAOimpl implements MemberDAO {

	private List<MemberVO> vos;
	private MemberVO vo;

	public MemberDAOimpl() {
		vos = new ArrayList<MemberVO>();

		for (int i = 0; i < 5; i++) {
			vo = new MemberVO();
			vo.setNum(1 + i);
			vo.setId("admin" + (1 + i));
			vo.setPw("hi111" + (1 + i));
			vo.setName("kim" + (1 + i));
			vo.setTel("011" + (1 + i));
			vos.add(vo);
		}
		for (int i = 5; i < 10; i++) {
			vo = new MemberVO();
			vo.setNum(1 + i);
			vo.setId("test" + (1 + i));
			vo.setPw("hi111" + (1 + i));
			vo.setName("lee" + (1 + i));
			vo.setTel("02" + (1 + i));
			vos.add(vo);
		}
	}

	@Override
	public MemberVO selectOne(MemberVO m) {
		System.out.println("selectOne()...");

		MemberVO m2 = new MemberVO();
		m2.setNum(1);
		m2.setId("asd");
		m2.setPw("as123");
		m2.setName("홍길동");
		m2.setTel("010");

		return m2;
	}

	@Override
	public List<MemberVO> selectAll() {
		System.out.println("selectAll()....");
		return vos;
	}

	@Override
	public int insert(MemberVO m) {
		System.out.println("insert()....");
		vos.add(m);

		if (vos.add(m)) {
			System.out.println(vos);
			return 1;
		}
		return 0;
	}

	@Override
	public int update(MemberVO m) {
		System.out.println("update()....");
		for (int i = 0; i < vos.size(); i++) {
			if (vos.get(i).getNum() == m.getNum()) {
				vos.set(i, m);
				return 1;
			}
		}
		return 0;

	}

	@Override
	public int delete(MemberVO m) {
		System.out.println("delete()....");
		for (int i = 0; i < vos.size(); i++) {
			if (vos.get(i).getNum() == m.getNum()) {
				vos.remove(m.getNum());
				System.out.println(vos);
				return 1;
			}
		}

		return 0;
	}

	public List<MemberVO> searchList(String searchKey, String searchWord) {
		List<MemberVO> list = new ArrayList<MemberVO>();
		if (searchKey.equals("id")) {
			System.out.println("아이디검색");
			for (int i = 0; i < vos.size(); i++) {
				if (vos.get(i).getId().contains(searchWord)) {
					list.add(vos.get(i));
				}
			}
		} else if (searchKey.equals("name")) {
			for (int i = 0; i < vos.size(); i++) {
				if (vos.get(i).getName().contains(searchWord)) {
					list.add(vos.get(i));
				}
			}
		} else if (searchKey.equals("num")) {
			for (int i = 0; i < vos.size(); i++) {
				if (vos.get(i).getNum() == Integer.parseInt(searchWord)) {
					list.add(vos.get(i));
				}
			}
			System.out.println("번호검색");
		}

		return list;
	}
}
