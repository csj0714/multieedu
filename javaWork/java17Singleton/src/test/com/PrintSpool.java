package test.com;

public class PrintSpool {

	private static PrintSpool singleton = new PrintSpool();

	public static PrintSpool getInstance() {
		return singleton;
	}

	private PrintSpool() {

	}

	public void print(String str) {
		System.out.println("출력 : " + str);
	}
}
