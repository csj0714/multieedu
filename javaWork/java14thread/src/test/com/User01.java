package test.com;

public class User01 extends Thread {

	private Calculator cal;

	public void setCal(Calculator cal) {
		this.setName("User01...");
		this.cal = cal;
	}

	@Override
	public void run() {
		cal.setMemory(100);
	}
}
