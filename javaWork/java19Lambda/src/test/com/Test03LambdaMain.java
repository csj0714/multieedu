package test.com;

public class Test03LambdaMain {

	public static void main(String[] args) {
		System.out.println("Lambda 3");

		new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(500);
						System.out.println(i);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		}.start();

		new Thread(() -> {
			for (int i = 10; i < 20; i++) {
				try {
					Thread.sleep(500);
					System.out.println(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

		Runnable run = () -> {
			for (int i = 110; i < 120; i++) {
				try {
					Thread.sleep(500);
					System.out.println(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		new Thread(run).start();

		test(() -> {
			for (int i = 1110; i < 1120; i++) {
				try {
					Thread.sleep(500);
					System.out.println(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		new Thread(test2()).start();

		System.out.println("end main....");

	}// end main

	private static Runnable test2() {
		return () -> {
			for (int i = 11110; i < 11120; i++) {
				try {
					Thread.sleep(500);
					System.out.println(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	}

	private static void test(Runnable run) {
		new Thread(run).start();
	}

}// end class
