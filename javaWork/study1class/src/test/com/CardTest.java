package test.com;

public class CardTest {

	public static void main(String args[]) {
		System.out.println(Card.height);
		System.out.println(Card.width);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1은 " + c1.kind + c1.number + "c2은 " + c2.kind + c2.number);

		c1.width = 50;
		c1.height = 80;

		System.out.println("c1은 " + c1.width + c1.height + "c2은 " + c2.width + c2.height);
		// 클래스변수(static)는 값을 공유한다.
	}
}
