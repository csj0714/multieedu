package test.com;

public class User02 extends Thread {
	private Calculator cal;

	public void setCal(Calculator cal) {
		this.setName("User02...");
		this.cal = cal;
	}

	@Override
	public void run() {
		cal.setMemory(50);
	}
}
