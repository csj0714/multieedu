package test.com;

public class Test01if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("if-else...");
		int x = 3;
		boolean bool = (x > 3);
		if (bool) {
			System.out.println("true");
		}
		double avg = 99.0;
		if (avg >= 90) {
			System.out.println("A");
		} else if (avg >= 80) {
			System.out.println("B");
		} else if (avg >= 70) {
			System.out.println("C");
		} else if (avg >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		System.out.println("ab");
	}

}
