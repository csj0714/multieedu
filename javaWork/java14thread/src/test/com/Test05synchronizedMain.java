package test.com;

public class Test05synchronizedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("synchronized...");

		Calculator cal = new Calculator();

		User01 u1 = new User01();
		u1.setCal(cal);
		u1.start();
		User02 u2 = new User02();
		u2.setCal(cal);
		u2.start();

	}

}
