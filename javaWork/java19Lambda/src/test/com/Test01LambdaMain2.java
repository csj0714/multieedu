package test.com;

public class Test01LambdaMain2 {

	public static void main(String[] args) {
		System.out.println("Lambda...2");

		Car c = new Car() {
			@Override
			public int start() {
				System.out.println("run()....1");
				return 10;
			}
		};
		c.start();
		test().start();
		test2(new Car() {
			@Override
			public int start() {

				System.out.println("run()....2");
				return 2;
			}
		});
	}

	private static void test2(Car c) {
		c.start();
	}

	private static Car test() {
		return new Car() {
			@Override
			public int start() {

				System.out.println("run()....2");
				return 0;
			}
		};
	}

}
