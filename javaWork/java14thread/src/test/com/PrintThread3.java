package test.com;

public class PrintThread3 extends Thread {

	private boolean stop; // false

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("running....");
			if (Thread.interrupted())
				break;
		}

		System.out.println("stop run...");
	}

}