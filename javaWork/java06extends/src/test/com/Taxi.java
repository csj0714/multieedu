package test.com;

public class Taxi extends Car {

	String part;
	int pay;

	void stop() {
		System.out.println("Taxi stop()...");
	}

	@Override
	void start() {
		System.out.println("Taxi start()...");
	}

}