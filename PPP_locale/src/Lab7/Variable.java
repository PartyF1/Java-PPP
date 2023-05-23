package Lab7;

public class Variable extends Primitive {
	private String name;
    private int value;
    
    public Variable(int value, String name) {
		super(value);
		this.value = value;
		this.name = name;
	}
    
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return this.name;
    }
    
    public int add(Variable b) {
    	return this.value + b.getValue();
    }
    
    public boolean equals(Variable b) {
    	return (this.name.equals(b.getName()) && this.value == b.getValue());
    }
    
    public String toString() {
		return this.getName() + ": " + (Integer) this.value ;
	}
}
