package test.com;

public class TestList2<T> {

	private T type;

	public void addType(T type) {
		// TODO Auto-generated method stub
		this.type = type;
	}

	public T getType() {
		return type;
	}

	public <G> G getGet(G g) {
		return g;
	}

}