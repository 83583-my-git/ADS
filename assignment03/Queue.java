package assignment;

import java.util.Arrays;

public class Queue {
	
	private int rear,front;
	private int arr[];
	private final int SIZE;
	private int count = 0;
	
	public Queue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		rear = front = -1;
		
	}
	public void push(int value) {
		count++;
		rear = (rear+1)%SIZE;
		arr[rear]= value;
	}
	public int pop() {
		count--;
		int temp = arr[(front+1)%SIZE];
		front = (front+1)%SIZE;
		return temp;
	}
	public int peek() {
		return (front + 1)%SIZE;
	}
	public boolean isFull() {
		return count == SIZE;
	}
	public boolean isEmpty() {
		return count == 0;
	}
	public void display() {
		System.out.println(Arrays.toString(arr));
	}
}
