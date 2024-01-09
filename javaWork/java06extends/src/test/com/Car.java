package test.com;

//class에 final선언하면 상속을 금지한다의미.
public /* final */ class Car {

	String model;
	int price;

	void start() {
		System.out.println("Car start()...");
	}

}
