package test.com;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("상속....");

		Member m = new Member();
		System.out.println(m);

		Member m2 = new Member(1, "admin", "hi1111", "kim", "010");
		System.out.println(m2);

		Member m3 = new Member();
		m3.setNum(11);
		m3.setId("tester");
		m3.setPw("hi2222");
		m3.setName("lee");
		m3.setTel("02");
		System.out.println(m3);

//		System.out.println(m3.getNum());
//		System.out.println(m3.getId());
//		System.out.println(m3.getPw());
//		System.out.println(m3.getName());
//		System.out.println(m3.getTel());

		MemberAbs abs = new MemberAbsEx();
		int result = abs.insert(m3);
		System.out.println("result:" + result);

		MemberAbs abs2 = new MemberAbs() {

			@Override
			public int insert(Member m) {
				System.out.println("insert()...2");
				System.out.println(m);
				return 1;
			}
		};
		result = abs2.insert(m3);
		System.out.println("result:" + result);

		// MemberInter 인터페이스를 만들고
		// 추상메소드 + update(Member) : int
		// 상속받는 클래스명 : MemberInterImpl
		MemberInter inter = new MemberInterImpl();
		result = inter.update(m3);
		System.out.println("result:" + result);

		// 익명내부클래스도 작성할것.
		MemberInter inter2 = new MemberInter() {

			@Override
			public int update(Member m) {
				System.out.println("update()...2");
				System.out.println(m);
				return 100;
			}
		};
		result = inter2.update(m3);
		System.out.println("result:" + result);

	}// end main

}// end class
