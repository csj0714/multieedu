package test.com;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("Enum....2");

		System.out.println(Test02_season.SPRING);// 3월~5월
		System.out.println(Test02_season.SPRING.name());// SPRING
		System.out.println(Test02_season.SPRING.ordinal());// 0

		System.out.println(Test02_season.values());// Test02_season[]

		Test02_season[] values = Test02_season.values();
		for (Test02_season x : values) {
			System.out.print(x.name() + " : ");
			System.out.println(x);
		}

	}// end main

}// end class