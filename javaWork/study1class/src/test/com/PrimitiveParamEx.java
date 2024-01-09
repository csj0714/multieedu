package test.com;

class Data {
	int x;
}

public class PrimitiveParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : " + d.x);
		change(d.x);
		System.out.println("After change(d.x)" + d.x);
	}

	static void change(int x) {
		x = 1000;
		System.out.println("change() : " + x);
	}

}
