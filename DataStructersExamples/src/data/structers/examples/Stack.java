package data.structers.examples;

public class Stack {

	private int[] stackArray;
	private int size;
	private int top;

	public Stack() {
		size = 10;
		stackArray = new int[10];
		top = 0;
	}

	public Stack(int newSize) {
		if (newSize <= 0)
			size = 10;
		else
			size = newSize;
		stackArray = new int[size];
		top = 0;
	}

	public void initializeStack() {
		top = 0;
	}

	public boolean isEmpty() {
		return (top == 0);
	}

	public boolean isFull() {
		return (top == size);
	}

	public boolean push(int newItem) {
		if (!isFull()) {
			stackArray[top] = newItem;
			top++;
			return true;
		} else
			return false;
	}

	public int pop() {
		if (!isEmpty()) {
			top--;
			return stackArray[top];
		} else
			return 0;
	}

	public int top() {
		assert (top == 0);
		return stackArray[top - 1];
	}

	public void outputStack() {
		if (top != 0)
			for (int i = top - 1; i >= 0; i--)
				System.out.println(stackArray[i]);
	}
	
	public int findMinimum() {
		
		int min = stackArray[0];
		
		for(int i=0; i<top; i++) {
			
			if(stackArray[i]<min) {
				min=stackArray[i];
			}
			
		}return min;
		
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		System.out.println("--Before pushing elements--");
		s.outputStack();
		System.out.println();
		s.push(10);
		s.push(15);
		s.push(60);
		s.push(80);
		s.push(50);
		s.push(2);

		System.out.println("--After pushing elements--");
		s.outputStack();
		System.out.println("Top: " + s.top);
		
		System.out.println();
		System.out.println("min : " + s.findMinimum());
		
	}

}
