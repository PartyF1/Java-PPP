package Lab7;

public class Literal extends Primitive {
	private String value;

	public Literal(int value) {
		super(value);
		this.value = Integer.toString(value);
	}
	
    public int getValue() {
        return Integer.parseInt(this.value);
    }

    public void setValue(int value) {
        this.value = Integer.toString(value);
    }
    
    public int add(Literal b) {
		return this.getValue() + b.getValue();
	}
    
    public String toString() {
		return this.value ;
	}
    
    public boolean equals(Literal b) {
    	return (this.getValue() == b.getValue());
    }
}
