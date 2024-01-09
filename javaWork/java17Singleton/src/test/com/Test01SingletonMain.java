package test.com;

public class Test01SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread(new Runnable() {
			public void run() {
				PrintSpool ps1 = PrintSpool.getInstance();
				System.out.println(ps1);
				ps1.print("hello");
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				PrintSpool ps2 = PrintSpool.getInstance();
				System.out.println(ps2);
				ps2.print("kim");
			}
		}).start();

	}

}
