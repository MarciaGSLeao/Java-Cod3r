package exercises;

import java.util.Objects;

public class KeyValue<C, V> {

	private C key;
	private V value;
	
	public KeyValue() {
	}
	
	public KeyValue(C key, V value) {
		this.key = key;
		this.value = value;
	}

	public C getKey() {
		return key;
	}

	public void setKey(C key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(key);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyValue<?, ?> other = (KeyValue<?, ?>) obj;
		return Objects.equals(key, other.key);
	}
	
}
