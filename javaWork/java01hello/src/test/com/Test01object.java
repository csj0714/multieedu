package test.com;

import java.util.Random;

public class Test01object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();
		System.out.println(p.age);
		System.out.println(p.name);
		System.out.println(p.score);
		int[] numbers = new int[5];

		Random random = new Random();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
