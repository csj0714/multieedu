package test.com;

public class TestList4<T extends Number> {

	private T type;

	public void addType(T type) {
		this.type = type;
	}

	public T getType() {
		return type;
	}

	public <G extends Number> G getGet(G g) {
		return g;
	}

	public static <G extends Number> G getStaticGet(G g) {
		return g;
	}

}