package test.com;

public class Test01LambdaMain3 {

	public static void main(String[] args) {
		System.out.println("Lambda...3");

		Bus b = new Bus() {
			@Override
			public void open(int x) {
				System.out.println("open()...." + x);
			}
		};
		b.open(1);
		test().open(2);
		test2(new Bus() {
			@Override
			public void open(int x) {
				System.out.println("open()...." + x);
			}
		});

		System.out.println("============");

		Taxi t = new Taxi() {
			@Override
			public int sum(int x, int y) {
				System.out.println("sum()...." + (x + y));
				return x + y;
			}
		};
		int result = t.sum(1, 2);
		System.out.println(result);
		int result2 = test3().sum(3, 4);
		System.out.println(result2);
		test4(new Taxi() {
			@Override
			public int sum(int x, int y) {
				System.out.println("sum()...." + (x + y));
				return x + y;
			}
		});
	}// end main

	private static Bus test() {
		return new Bus() {
			@Override
			public void open(int x) {

				System.out.println("open()...." + x);
			}
		};
	}

	private static void test2(Bus b) {
		b.open(3);
	}

	private static Taxi test3() {
		return new Taxi() {
			@Override
			public int sum(int x, int y) {

				System.out.println("sum()...." + (x + y));
				return x + y;
			}
		};
	}

	private static void test4(Taxi t) {
		int result = t.sum(5, 6);
		System.out.println(result);
	}

}// end class
