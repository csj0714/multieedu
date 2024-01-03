package test.com;

public class Member {
	int num;
	String id;
	String pw;
	String name;
	String tel;

	public Member() {
		System.out.println("constructor...");

	}

	public Member(int num, String id, String pw, String name, String tel) {
		super();
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;

	}

	@Override
	public String toString() {
		return "Member [num=" + num + ", id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}

}
