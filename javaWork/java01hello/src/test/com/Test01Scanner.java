package test.com;

import java.util.Scanner;

public class Test01Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("input your name: ");
		String name = s.next();
		System.out.println("name: " + name);

		System.out.print("input your name: ");
		String title = s.next();
		System.out.println("title: " + title);

		System.out.print("input your name: ");
		int age = s.nextInt();
		System.out.println("age: " + age);

	}

}
