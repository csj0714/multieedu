package test.com;

public class MemberOuter {

	private String id = "admin";
	private String pw = "hi111";
	private static String tel = "010";

	class Student {
		String name = "kim";
		int kor = 99;
		static int eng = 88;// jdk 17+

		public Student() {
			System.out.println("Student()....");
			id = "tester";
			pw = "hi222";
		}

		public String getOutInfo() {
			return id + pw;
		}
	}

	static class Bus {
		static int money = 300;
		static int count = 10;

		public Bus() {
			System.out.println("Bus()...");
		}

		static void start() {
			System.out.println("start()...." + tel);
		}
	}

}