package test.com;

public class Test03Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Man m = new SuperMan();
		m.sleep();
		m.work();

		Man m2 = new Man() {
			@Override
			public void work() {
				System.out.println("Anonymous work");
			}
		};
		m2.work();
	}

}
