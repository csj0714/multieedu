package test.com;

public class PrintThread1 extends Thread {

	private boolean stop; // false

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		// stop속성이 거짓일때는 무한반복
		// 메소드를 이용해서 setStop()setter로 true,false제어
		while (!stop) {
			System.out.println("running....");
		}
		System.out.println("stop run...");
	}

}