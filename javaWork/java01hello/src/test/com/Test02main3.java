package test.com;

public class Test02main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("constructor3...");

		Member m = new Member();
		System.out.println(m);

		Member m2 = new Member(1, "admin", "hi1234", "kim", "010");
		System.out.println(m2);

		Member[] ms = new Member[] { m, m2 };

		for (int i = 0; i < ms.length; i++) {
			System.out.println(ms[i]);
		}
	}

}
