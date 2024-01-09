package test.com;

public class ReferenceParamEx3 {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 2, 1, 6, 5, 4 };

		printArr(arr);
		System.out.println(sumArr(arr));
		sortArr(arr);
		printArr(arr);

	}

	static void printArr(int[] arr) {
		System.out.println("print");

		for (int i : arr) {
			System.out.println(i);
		}
	}

	static int sumArr(int[] arr) {
		System.out.println("sum");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	static void sortArr(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
}
