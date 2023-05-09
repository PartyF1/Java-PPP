package Lab6;

public class Element {
	private int value;
	private Element next;
	private Element prev;
	
	public Element(int value, Element prev, Element next) {
		this.value = value;
		this.next = next;
		this.prev = prev;
	}
	
	public Element () {
		this.value = 0;
		this.next = null;
		this.prev = null;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public Element getNext() {
		return next;
	}
	
	public Element getPrev() {
		return prev;
	}
	
	public void setNext(Element next) {
		this.next = next;
	}
	
	public void setPrev(Element prev) {
		this.prev = prev;
	}
	
	public void print() {
		System.out.print(value);
	}
}
