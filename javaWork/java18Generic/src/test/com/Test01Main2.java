package test.com;

import java.util.ArrayList;
import java.util.List;

public class Test01Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car());
		cars.add(new Bus());
		cars.add(new BigBus());
		cars.add(new Taxi());
		cars.add(new BigTaxi());
		System.out.println(cars);
		System.out.println("============");

		List<Bus> cars2 = new ArrayList<Bus>();

		cars2.add(new Bus());
		cars2.add(new BigBus());
//		cars2.add(new Taxi());
//		cars2.add(new BigTaxi());
		System.out.println(cars2);
		System.out.println("============");

	}

}
