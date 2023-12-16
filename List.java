
public class List {

	private static final String START_LABEL = "|START|";
	public Element head;

	// Aufgabe 1
	public void addElement(Element newElement) {
		Element node = head;
		if(node == null) {
			head = newElement;
		}else {
			while(node != null && node.getNext() != null) {
				node = node.getNext();
			}
			node.setNext(newElement);
		}
		
	}

	// Aufgabe 2
	public int getSize() {
		int count = 0;
		Element node = head;
		if(node == null) {
			return count;
		} else {
			while(node != null) {
				node = node.getNext();
				count++;
			}
		}
		
		return count;
	}

	// Aufgabe 3
	public void increase() {
		Element node = head;
		while(node!= null) {
			node.increaseByOne();
			node = node.getNext();
		}
	}

	// Aufgabe 4
	public void deleteElement() {
		if (getSize() > 0) {
			head = head.getNext();
		}
	}

	// Methode, die zur Darstellung der Liste dient.
	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder(START_LABEL);

		Element pointer = head;
		while (pointer != null) {
			str.append("---> ");
			str.append(pointer.getValue());
			pointer = pointer.getNext();
		}

		str.append("---> null");

		return str.toString();
	}
}
