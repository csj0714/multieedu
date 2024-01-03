package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01array8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] scores = new String[3][7]; // Assuming you want to store 7 values for each person

		for (int i = 0; i < scores.length; i++) {
			System.out.println("이름: ");
			String name = br.readLine();
			System.out.println("국어: ");
			String kor = br.readLine();
			System.out.println("영어: ");
			String eng = br.readLine();
			System.out.println("수학: ");
			String math = br.readLine();
			int total = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math);
			double avg = total / 3.0;
			char grade;

			if (avg >= 90) {
				grade = 'A';
			} else if (avg >= 80) {
				grade = 'B';
			} else if (avg >= 70) {
				grade = 'C';
			} else if (avg >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}

			// Create an array to store the current person's data
			String[] score = new String[] { name, kor, eng, math, String.valueOf(total), String.valueOf(avg),
					String.valueOf(grade) };

			// Assign the 'score' array to the corresponding element in 'scores' array
			scores[i] = score;
		}

		for (int x = 0; x < scores.length; x++) {
			for (int y = 0; y < scores[x].length; y++) {
				System.out.print(scores[x][y] + " ");
			}
			System.out.println();
		}
	}

}
