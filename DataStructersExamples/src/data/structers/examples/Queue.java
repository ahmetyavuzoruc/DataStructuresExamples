package data.structers.examples;

import java.util.ArrayList;
import java.util.Collections;

public class Queue {

	private int[] queueArray;
	private int size;
	private int front;
	private int rear;
	private int count;

	public Queue() {
		size = 10;
		queueArray = new int[size];
		front = 0;
		rear = size - 1;
		count = 0;
	}

	public Queue(int newSize) {
		if (newSize <= 0)
			size = 10;
		else
			size = newSize;
		queueArray = new int[10];
		front = 0;
		rear = size - 1;
		count = 0;
	}

	public boolean isEmpty() {
		return (count == 0);
	}

	public boolean isFull() {
		return (count == size);
	}

	public void initializeQueue() {
		front = 0;
		rear = size - 1;
		count = 0;
	}

	public int getFront() {
		assert (!isEmpty());
		return queueArray[front];
	}

	public int getRear() {
		assert (!isEmpty());
		return queueArray[rear];
	}

	public void addQueue(int newElement) {
		if (!isFull()) {
			rear = (rear + 1) % size;
			count++;
			queueArray[rear] = newElement;
		} else
			System.out.println("Queue is full!");
	}

	public void deleteQueue() {
		if (!isEmpty()) {
			count--;
			front = (front + 1) % size;
		} else
			System.out.println("Queue is empty!");
	}

	public void outputQueue() {
		if (count != 0)
			for (int i = front; i <= rear; i++)
				System.out.println(queueArray[i]);
	}

	public static Queue reverseQueue(Queue q) {
		ArrayList<Integer> clone = new ArrayList<>();
		
		while(!q.isEmpty()){
			clone.add(q.getFront());
			q.deleteQueue();
		}
		Collections.reverse(clone);
		
		for(Integer i : clone) {
			q.addQueue(i);
		}
		return q;
	}

	public static void main(String[] args) {
		Queue a = new Queue();
		a.addQueue(5);
		a.addQueue(9);
		a.addQueue(8);
		a.addQueue(12);
		System.out.println("queue:");
		a.outputQueue();
		System.out.println("front: " + a.getFront());
		System.out.println("rear:" + a.getRear());
		a.addQueue(6);
		System.out.println("queue:");
		a.outputQueue();
		a.deleteQueue();
		System.out.println("queue after delete:");
		a.outputQueue();
		System.out.println("before reverse:");
		a.outputQueue();
		System.out.println("after reverse:");
		reverseQueue(a);
		a.outputQueue();

		// call reverseQueue function to test yourself.
	}

}
