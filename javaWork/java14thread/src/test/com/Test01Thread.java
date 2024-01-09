package test.com;

public class Test01Thread {

	public static void main(String[] args) {
		System.out.println("start main Thread");

		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(300);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		ThreadEx t01 = new ThreadEx();
		// t01.run();
		t01.start();

		Thread t02 = new Thread() {
			public void run() {
				for (int i = 100; i < 110; i++) {
					try {
						Thread.sleep(300);
						System.out.println(i);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
		};
		t02.start();

		Runnable r = new Test02RunnableImpl();
		new Thread(r).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 9900; i < 9910; i++) {
					try {
						Thread.sleep(300);
						System.out.println(i);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}
		}).start();

		System.out.println("end main");
	}

}
