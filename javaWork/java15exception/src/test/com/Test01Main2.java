package test.com;

public class Test01Main2 {

	public static void main(String[] args) {
		System.out.println("Exception....");

		// 프로그램 컴파일 또는 실행시에 발생할 수 있는 오류에 대해 대처하는 문법

		// 복합적인 오류를 내포할때...
		test01();

		System.out.println("end..main...");
	}// end main

	private static void test01() {
		int[] sus = new int[5];

		try {
			System.out.println("try...1");
			// try블럭에서 오류가 발생되면 캐치블럭으로 바로이동 후 정상실행
			System.out.println(sus[4]);

			System.out.println("try...2");
			System.out.println(10 / 10);

			System.out.println("try...3");
			String name = "kim";
			System.out.println(name.length());

			System.out.println("try...4");
			String str = "100a";
			System.out.println(Integer.parseInt(str) + 100);

			System.out.println("try...5");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch....ArrayIndexOutOfBoundsException");
		} catch (ArithmeticException e) {
			System.out.println("catch....ArithmeticException");
		} catch (NullPointerException e) {
			System.out.println("catch....NullPointerException");
		} catch (NumberFormatException e) {
			System.out.println("catch....NumberFormatException");
		} catch (Exception e) {
			System.out.println("catch....Exception");
		}

	}

}// end class