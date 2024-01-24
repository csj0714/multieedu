package test.com;

public class Test02LambdaMain {

	public static void main(String[] args) {
		System.out.println("Lambda...2");

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
	}

	private static void test2(Bus b) {
		b.open(3);
	}

	private static Bus test() {
		return new Bus() {
			@Override
			public void open(int x) {

				System.out.println("open()...." + x);
			}
		};
	}
}
