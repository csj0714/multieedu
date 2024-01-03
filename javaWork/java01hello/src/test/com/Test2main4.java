package test.com;

public class Test2main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Board b = new Board();
		System.out.println(b);
		Board b2 = new Board(123, "제목", "내용", "작성자", "2024-01-03");
		System.out.println(b2);

		Board[] bs = new Board[] { b, b2 };
		for (int i = 0; i < bs.length; i++) {
			System.out.println(bs[i]);
		}

		System.out.println(Board.content);
	}

}
