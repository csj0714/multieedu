package test.com;

public class Test01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test03();
	}

	private static void test03() {
		String name = null;

		try {
			System.out.println("try...1");
			System.err.println(name.length());
			System.out.println("try...2");
		} catch (NullPointerException e) {
			System.out.println("catch...");
		}
	}

	private static void test02() {
		try {
			System.out.println("try...1");
			System.err.println(10 / 0);
			System.out.println("try...2");
		} catch (ArithmeticException e) {
			System.out.println("catch...");
		}
	}

	private static void test01() {
		int[] sus = new int[5];

		try {
			System.out.println("try...1");

			System.out.println(sus[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch");
		}
	}
}
