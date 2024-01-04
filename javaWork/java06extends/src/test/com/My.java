package test.com;

public class My extends Father {

	String school_name = "MultiCam";

	public My() {
//		super();
		System.out.println("My()....");
	}

	public My(String x) {
		this();// 내 클래스의 생성자를 의미함.
		System.out.println("My(String x)....");
	}

	void study() {
		System.out.println("study()...");
		this.sleep();
		super.sleep();
	}

	@Override
	void sleep() {
		System.out.println("sleep()###");
	}

}