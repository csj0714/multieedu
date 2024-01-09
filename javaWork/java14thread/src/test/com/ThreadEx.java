package test.com;

public class ThreadEx extends Thread {
	@Override
	public void run() {
		for (int i = 10; i < 20; i++) {

			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
