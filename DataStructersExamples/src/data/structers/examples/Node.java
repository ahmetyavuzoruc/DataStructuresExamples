package data.structers.examples;

public class Node {
	
	public int item;
	public Node link;

	public Node() {
		link = null;
		item = 0;
	}

	public Node(int newItem) {
		setItem(newItem);
		link = null;
	}

	public Node(int newItem, Node linkValue) {
		setItem(newItem);
		link = linkValue;
	}

	public void setItem(int newItem) {
		item = newItem;
	}

	public void setLink(Node newLink) {
		link = newLink;
	}

	public int getItem() {
		return item;
	}

	public Node getLink() {
		return link;
	}

}
