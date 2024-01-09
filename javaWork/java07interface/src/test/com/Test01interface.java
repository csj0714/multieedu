package test.com;

public class Test01interface {

	public static void main(String[] args) {
		System.out.println("interface...");

		// 1.인터페이스란?
		// 다중상속을 지원하는 툴.
		// 모든 전역변수는 public static final
		// 추상메소드를 갖을 수 있다.

		// 2.인터페이스간의 상속 = 다중상속 가능,extends

		// 3.클래스와 인터페이스간의 상속 = 다중상속가능,
		// 클래스만 인터페이스를 상속받기가능.implements
		// 인터페이스 단독으로는 객체생성할수 없다.따라서
		// 상속관계의 클래스를 이용하여 객체를 생성한다>>> 다형성
		Person p = new PersonImpl();
		p.insert();
		p.delete();
		Person.update();

		Person p2 = new Person() {
			@Override
			public int insert() {
				System.out.println("Anonymous insert()...");
				return 0;
			}
		};
		p2.insert();

		Person2 pp2 = new Person2Impl();
		pp2.insert22();

		Person2 pp3 = new Person2() {

			@Override
			public int insert22() {
				System.out.println("Anonymous insert22()..");
				return 0;
			}
		};
		pp3.insert22();

	}// end main

}// end class
