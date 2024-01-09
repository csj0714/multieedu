package test.com;

public class Test03controlMain4 {

	public static void main(String[] args) {
		System.out.println("데몬 스레드");

		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true);
		ast.start();
		// 1초가 일시정지
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("end main....");
	}// end main

}// end class