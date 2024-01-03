package test.com;

public class Product {

	int num;
	String name;
	int price;

	public Product() {
		System.out.println("Product()...");
	}

	public Product(int num, String name, int price) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + ", price=" + price + "]";
	}

}
