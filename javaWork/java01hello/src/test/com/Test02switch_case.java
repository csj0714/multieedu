package test.com;

public class Test02switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("switch~case");
		String key1 = "a001";
		switch (key1) {
		case "a001": {
			System.out.println("Hello");
			break;
		}
		case "b001": {
			System.out.println("Hi");
		}
		default:
			System.out.println("bye");
			break;
		}
	}

}
