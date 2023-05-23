package Lab7;

public class Primitive {
	protected int value;
	
	public Primitive(int value) {
		this.value = value;
	}
	
	public boolean equals(Primitive b) {
		return this.value == b.getValue();
	}
	
	public String toString() {
		return Integer.toString(this.value);
	}
	
	public int hashCode() {
		return this.value;
	}
	
	public int add(Primitive b) {
		return this.value + b.getValue();
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}
