package test.com;

public class Test02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();

		Bus b = new Bus();
		System.out.println(b.Model);
		Taxi t = new Taxi();

		Car c2 = new Bus();
		Car c3 = new Taxi();

		c2.start();

		Car c4 = new Car() {
			@Override
			void start() {
				System.out.println("Anonymous start()");
			}

		};
		c4.start();
		System.out.println(c4.Model);
	}

}
