package test.com;

public class Test02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("클래스 간의 상속....");

		Car c = new Car();
		System.out.println(c.model);
		System.out.println(c.price);
		c.start();

		System.out.println("============");
		Bus b = new Bus();
		System.out.println(b.model);
		System.out.println(b.price);
		System.out.println(b.count);
		System.out.println(b.pay);
		b.start();
		b.open();

		System.out.println("============");
		Taxi t = new Taxi();
		System.out.println(t.model);
		System.out.println(t.price);
		System.out.println(t.part);
		System.out.println(t.pay);
		t.start();
		t.stop();
		System.out.println("============");

		Car c2 = new Bus();
		Car c3 = new Taxi();

		System.out.println("============");

		Car c4 = new Car() {
			@Override
			void start() {
				System.out.println("Anonymous start()...");
			}
		};
		c4.start();

	}// end main

}// end class