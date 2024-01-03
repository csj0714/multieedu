package test.com;

public class Test01method {

	// 1.인스턴스 메소드 - 객체생성후에 접근가능
	// 리턴없고, 매개변수 없고
	void test01() {

		// return;//생략가능
	}

	// 리턴있고, 매개변수 있고
	int test02(int x) {
		/* this. */test01();
		return x / 200;
	}

	// 리턴없고, 매개변수 있고
	void test03(String str) {

		int x = test02(11);
	}

	// 리턴 있고, 매개변수 없고
	String test04() {
		/* Test01method. */sleep04();
		return "kim";
	}

	// 2.스테틱 메소드 - 클래스 이름으로 접근가능

	static void sleep01() {
		new Test01method().test04();
	}

	static String sleep02(int x, int y) {
		/* Test01method. */sleep01();
		return "hello";
	}

	static void sleep03(int[] arr) {

	}

	static int sleep04() {
		return 100;
	}

	public static void main(String[] args) {
		System.out.println("method..메소드");

	}// end main

}// end class
