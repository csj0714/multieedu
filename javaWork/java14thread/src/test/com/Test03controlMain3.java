package test.com;

public class Test03controlMain3 {

	public static void main(String[] args) {
		System.out.println("스레드 제어");

		PrintThread3 pt3 = new PrintThread3();
		pt3.start();

		// 1초가 일시정지
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 스레드 종료용 interrupt...
		pt3.interrupt();

		System.out.println("end main....");
	}// end main

}// end class