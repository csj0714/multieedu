package test.com;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("save...");
	}

	@Override
	public void run() {

		while (true) {
			try {
				System.out.println("running...");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			save();

			System.out.println("stop run...");
		}
	}
}
