package test.com;

public class Bus extends Car {

	int count;
	int pay;

	void open() {
		System.out.println("Bus open()....");
	}

	@Override
	void start() {
		System.out.println("Bus start()....");
	}

}