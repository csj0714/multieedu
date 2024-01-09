package test.com;

public class PrintThread2 extends Thread {

	private boolean stop; // false

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("running....");
				Thread.sleep(1);
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("stop run...");
	}

}