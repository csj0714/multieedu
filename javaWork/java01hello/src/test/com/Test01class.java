package test.com;

//임포트 단축키 : ctrl + shift + o
public class Test01class {

	public static void main(String[] args) {
		System.out.println("object...3");

		Student st = new Student();// 생성자 호출(콜)

		st.name = "kim";
		st.kor = 99;
		st.eng = 88;
		st.math = 77;

		st.total = st.kor + st.eng + st.math;

		st.avg = st.total / 3.0;

		if (st.avg >= 90) {
			st.grade = "A";
		} else if (st.avg >= 80) {
			st.grade = "B";
		} else if (st.avg >= 70) {
			st.grade = "C";
		} else if (st.avg >= 60) {
			st.grade = "D";
		} else {
			st.grade = "F";
		}

		System.out.println(st);

	}// end main

}// end class