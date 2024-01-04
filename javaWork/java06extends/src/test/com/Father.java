package test.com;

public class Father extends GrandFather {

	String name = "이립";
//	int age = 77;
	String car_name = "bmw";

	public Father() {
//		super();//슈퍼클래스 생성자
		System.out.println("Father()....");
	}

	// 메소드의 재정의 : 오버라이딩
	// 재정의된 메소드이 변경을 못하도록 제한하는 어노테이션@
	@Override
	void sleep() {
		System.out.println("sleep()***");
	}

	void work() {
		System.out.println("work()...");
		System.out.println("this.name : " + this.name);
		System.out.println("super.name : " + super.name);
		this.sleep();
		super.sleep();
	}

}