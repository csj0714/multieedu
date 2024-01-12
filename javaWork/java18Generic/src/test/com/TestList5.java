package test.com;

public class TestList5<T extends Bus> {

	private T type;

	public void addType(T type) {
		this.type = type;
	}

	public T getType() {
		return type;
	}

	public <G extends Bus> G getGet(G g) {
		return g;
	}

	public static <G extends Bus> G getStaticGet(G g) {
		return g;
	}

}