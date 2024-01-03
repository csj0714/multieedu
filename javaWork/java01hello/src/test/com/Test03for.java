package test.com;

public class Test03for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}
		System.out.println();

		for (int x = 2; x < 10; x++) {
			for (int y = 1; y < 10; y++) {
				System.out.printf("%d * %d = %2d ", x, y, x * y);

			}
			System.out.println();
		}
	}

}
