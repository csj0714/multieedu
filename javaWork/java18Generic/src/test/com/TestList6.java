package test.com;

public class TestList6<T extends Car> {

	private T type;

	public void addType(T type) {
		this.type = type;
	}

	public T getType() {
		return type;
	}

	public <G extends Car> G getGet(G g) {
		return g;
	}

	public static <G extends Car> G getStaticGet(G g) {
		return g;
	}

}