package test.com;

public class SuperMan extends Man {
	// 추상 클래스를 상속받기 위해서는 abstract 추상 메소드를 오버라이딩을 해줘야한다.
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Super man Work()");
	}

}
