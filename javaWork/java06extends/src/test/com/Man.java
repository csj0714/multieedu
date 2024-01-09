package test.com;

public abstract class Man {

	public Man() {
		System.out.println("Man");
	}

	public void sleep() {
		System.out.println("sleep()....");
	}

	public abstract void work();
}
