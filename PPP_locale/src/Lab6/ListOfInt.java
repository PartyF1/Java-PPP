package Lab6;

public class ListOfInt {
	int size;
	Element first;
	Element last;
	
	public ListOfInt() {
		this.size = 0;
		this.first = new Element();
		this.last = new Element();
		this.first.setNext(last);
		this.last.setPrev(first);
	}
	
	public ListOfInt(ListOfInt oldList) {
		this.size = oldList.size;
		this.first = oldList.first;
		this.last = oldList.last;
	}
	
	public void insert(int value) {
		if (this.first.getNext() == this.last) {
			Element newElem = new Element(value, first, last);
			this.first.setNext(newElem);
			this.last.setPrev(newElem);
			this.size++;
		} else {
			Element newElem = new Element(value, last.getPrev(), last);
			last.getPrev().setNext(newElem);
			last.setPrev(newElem);
			this.size++;
		}
	}
	
	public Element at(int num) {
		Iterator it = new Iterator(this);
		return it.at(num);
	}
	
	public void erase(int num) {
		Element current = this.at(num);
		current.getNext().setPrev(current.getPrev());
		current.getPrev().setNext(current.getNext());
	}
	
	public void print() {
		Iterator it = new Iterator(this);
		while (it.element != last) {
			it.element.print();
			it.next();
		}
	}
	
	public int find(int value) {
		Iterator it = new Iterator(this);
		while (it.element != last) {
			if (it.element.getValue() == value) {
				return it.num;
			} else {
				it.next();
			}
		}
		return -1;
	}
	
	public class Iterator {
		Element element;
		int num;
	
		public Iterator(ListOfInt list) {
			this.element = list.first.getNext();
			int num = 0;
		}
		
		public Iterator(Element element) {
			this.element = element;
			this.num = 0;
		}
		
		public void next() {
			element = element.getNext();
			this.num++;
		}
		
		public void prev() {
			element = element.getPrev();
			this.num++;
		}
		
		public Element at(int i) {
			int it = 0;
			Element tempElem = element;
			while (it < i) {
				tempElem = tempElem.getNext();
				it++;
			}
			return tempElem;
		}
	}
}
