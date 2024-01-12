package test.com;

import java.util.Objects;

public class Coin {

	private int value;

	public Coin() {
		// TODO Auto-generated constructor stub
	}

	public Coin(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coin other = (Coin) obj;
		return value == other.value;
	}

	@Override
	public String toString() {
		return "Coin [value=" + value + "]";
	}

}