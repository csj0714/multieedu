package test.com;

public class Test02main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("constructor...2");

		Product p = new Product();
		System.out.println(p);

		Product p2 = new Product(11, "Phone", 3000);
		System.out.println(p2);

		int[] arr = new int[] { 10, 20 };

		Product[] ps = new Product[] { p, p2 };
		for (int i = 0; i < ps.length; i++) {
			System.out.println(ps[i]);
		}
	}

}
