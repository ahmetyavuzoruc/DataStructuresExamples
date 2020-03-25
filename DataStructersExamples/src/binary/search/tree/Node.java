package binary.search.tree;

public class Node {
	

	private int key; 
	Node leftChild, rightChild; 
	
	Node(int key, Node leftChild, Node rightChild) {
		this.key = key;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

}
