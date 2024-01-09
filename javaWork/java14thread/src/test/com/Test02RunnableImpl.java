package test.com;

public class Test02RunnableImpl implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1110; i < 1120; i++) {

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
