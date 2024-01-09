package test.com;

public interface Person {

	/* public static final */ int X = 10;
	String URL = "http://aaa.com";

	// 1.추상메소드
	public /* abstract */ int insert();// 추상메소드,오바라이딩을 강제한다.

	// 2.스테틱메소드
	public static void update() {
		System.out.println("static update()....");
	}

	// 3.디폴트 default 메소드
	public default void delete() {
		System.out.println("default delete()...");
	}

}
