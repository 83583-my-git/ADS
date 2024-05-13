package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingStack {
	private int arr[];
	private int top;
	private final int SIZE;
	
	public DescendingStack(int size) {
		SIZE = size;
		top = SIZE; //descending stack where top start from size
		arr = new int[SIZE];
		
	}
	public void push(int value) {
		top--;
		arr[top]= value;
	}
	public int pop() {
		int temp = arr[top];
		top++;
		return temp;
	}
	public int peek() {
		return arr[top];
	}
	public boolean isEmpty() {
		return top == SIZE;
	}
	public boolean isFull() {
		
		return top == 0;
	}
	public void display() {
		System.out.println(Arrays.toString(arr));
	}
	
	

}
class DescendingStackMain{
	public static void main(String[] args) {
		DescendingStack dst = new DescendingStack(5);
		int choice;
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			System.out.println("enter your choice ");
			System.out.println("0. exit");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. peek");
			System.out.println("4. display stack");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				if(!dst.isFull()) {
					System.out.println("enter value to push");
					int value = sc.nextInt();
					dst.push(value);
				}
				else {
					System.out.println("sorry buddy! stack is full");
				}
					
				
				}
				break;
			case 2:{
				if(!dst.isEmpty()) {
					System.out.println("popped element"+dst.pop());
				}
				else {
					System.out.println("stack is empty");
				}
				break;
			}
			case 3:{
				if(!dst.isEmpty()) {
					System.out.println("peek element is "+dst.peek());
				}
				else {
					System.out.println("stack is empty");
				}
				break;
				
			}
			case 4:
				dst.display();
				break;
			}
			
				
			
		} while (choice != 0);
	}
}
