package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test04while {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean bool = true;
		while (bool) {
			System.out.println("while...");
			System.out.println("Input your name:");
			String name = br.readLine();
			System.out.println("종료하려면 x 입력");
			String x = br.readLine();
			System.out.println(name);
			if (x.equals("x")) {
				break;
			}
		}
	}

}
