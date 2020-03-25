package data.structers.examples;

public class LinkedList {

	private Node first;
	private Node last;

	public LinkedList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertAtFront(int itemName) {

		if (isEmpty()) {
			first = last = new Node(itemName);
		} else {
			first = new Node(itemName, first);
		}

	}

	public boolean removeFromFront() {
		if (isEmpty()) {
			return false;
		} else {
			if (first == last) {
				first = last = null;
			} else {
				first = first.getLink();
			}

		}
		return true;
	}

	public void insertAtBack(int itemName) {
		if (isEmpty()) {
			first = last = new Node(itemName);
		} else {
			last.setLink(new Node(itemName));
		}
	}

	public boolean removeFromBack() {
		if (isEmpty()) {
			return false;
		} else {
			if (first == last) {
				first = last = null;
			} else {

				Node current = first;
				while (current.getLink() != last) {
					current = current.getLink();
				}
				current.setLink(null);
				last = current;
			}
			return true;

		}
	}

	public int size() {
		int count = 0;
		Node current = first;
		while (current != null) {
			count++;
			current = current.getLink();
		}
		return count;
	}

	public void outputList() {
		Node current = first;
		while (current != null) {
			System.out.println(current.getItem());
			current = current.getLink();

		}
	}

	private Node find(int target) {
		Node position = first;
		int itemAtPosition;
		while (position != null) {
			itemAtPosition = position.getItem();
			if (itemAtPosition == target)
				return position;
			position = position.getLink();
		}
		return null; // target was not found
	}

	public boolean contains(int item) {
		return (find(item) != null);
	}

	public void Insertion(int value) {
		Node newNode = new Node(value);
		if (first == null) {
			first = newNode;
		} else {
			Node current = first;
			while (current.getLink() != null) {
				current = current.link;
			}
			current.link = newNode;
		}
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.insertAtFront(5);
		list.insertAtBack(10);
		list.insertAtFront(0);

		list.outputList();

		if (list.removeFromFront())
			System.out.println("SEN2211");
		else
			System.out.println("SEN1001");

		list.outputList();
	}
}
