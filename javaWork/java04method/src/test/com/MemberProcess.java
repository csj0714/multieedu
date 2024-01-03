package test.com;

public class MemberProcess {

	Member[] listMember() {
		Member[] list = new Member[3];
		list[0] = new Member(1, "admin1", "hi1111", "kim1", "011");
		list[1] = new Member(2, "admin2", "hi1112", "kim2", "012");
		list[2] = new Member(3, "admin3", "hi1113", "kim3", "013");
		return list;
	}
}
