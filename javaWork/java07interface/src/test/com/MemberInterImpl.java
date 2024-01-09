package test.com;

public class MemberInterImpl implements MemberInter {

	@Override
	public int update(Member m) {
		System.out.println("update()...");
		System.out.println(m);
		return 10;
	}

}
