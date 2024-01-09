package test.com;

public class Test03controlMain2 {

	public static void main(String[] args) {
		System.out.println("스레드 제어");

		PrintThread2 pt2 = new PrintThread2();
		pt2.start();

		// 1초가 일시정지
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 스레드 종료용 interrupt...
		pt2.interrupt();

		System.out.println("end main....");
	}// end main

}// end class