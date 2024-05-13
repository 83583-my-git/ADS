package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValueOfStack {
	public static void main(String[] args) {
		Stack st = new Stack(5);
		int choice;
		Scanner sc = new Scanner(System.in);
		int temp = 0;
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
				if (!st.isFull()) {
					System.out.println("enter value to push");
					int value = sc.nextInt();
					
					if(st.isEmpty() || value >= temp) {
						temp = value;
					}
					System.out.println("maximun of stack is = "+temp);
					
					st.push(value);
				} else {
					System.out.println("sorry buddy! stack is full");
				}

			}
				break;
			case 2: {
				if (!st.isEmpty()) {
					System.out.println("popped element" + st.pop());
				} else {
					System.out.println("stack is empty");
				}
				break;
			}
			case 3: {
				if (!st.isEmpty()) {
					System.out.println("peek element is " + st.peek());
				} else {
					System.out.println("stack is empty");
				}
				break;

			}
			case 4:
				st.display();
				break;
			}

		} while (choice != 0);
	}
}