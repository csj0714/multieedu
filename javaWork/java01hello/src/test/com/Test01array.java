package test.com;

public class Test01array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 11, 22, 33 };
		arr = new int[] { 44, 55, 66, 88 };
		System.out.println(arr[0]);

		String strs[] = new String[] { "java", "html", "css" };

		int[][] arrs = new int[3][5];

		for (int[] item : arrs) {
			for (int items : item) {
				System.out.print(items);
			}
			System.out.println();
		}
		String[][] strss = new String[3][5];
		for (String[] items : strss) {
			for (String item : items) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
	}

}
