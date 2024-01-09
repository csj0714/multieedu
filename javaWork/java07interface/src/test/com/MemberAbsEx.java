package test.com;

public class MemberAbsEx extends MemberAbs {

	@Override
	public int insert(Member m) {
		System.out.println("insert()...");
		System.out.println(m);
		return 0;
	}

}
